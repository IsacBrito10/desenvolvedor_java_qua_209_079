const linhasPorPagina = 10; // Quantidade de usuários por página
    let paginaAtual = 1;

    const tabela = document.getElementById("tabela-usuarios");
    const linhas = tabela.getElementsByTagName("tr");
    const totalPaginas = Math.ceil(linhas.length / linhasPorPagina);

    function mostrarPagina(pagina) {
        const inicio = (pagina - 1) * linhasPorPagina;
        const fim = inicio + linhasPorPagina;

        for (let i = 0; i < linhas.length; i++) {
            linhas[i].style.display = (i >= inicio && i < fim) ? "" : "none";
        }

        paginaAtual = pagina;
        atualizarPaginacao();
    }

    function atualizarPaginacao() {
        const paginacaoDiv = document.getElementById("paginacao");
        paginacaoDiv.innerHTML = "";

        // Botão Anterior
        const btnAnterior = document.createElement("button");
        btnAnterior.textContent = "Anterior";
        btnAnterior.disabled = paginaAtual === 1;
        btnAnterior.className = "btn btn-light mx-1";
        btnAnterior.onclick = () => mostrarPagina(paginaAtual - 1);
        paginacaoDiv.appendChild(btnAnterior);

        // Botões numéricos
        for (let i = 1; i <= totalPaginas; i++) {
            const btn = document.createElement("button");
            btn.textContent = i;
            btn.className = "btn mx-1 " + (i === paginaAtual ? "btn-primary" : "btn-light");
            btn.onclick = () => mostrarPagina(i);
            paginacaoDiv.appendChild(btn);
        }

        // Botão Próximo
        const btnProximo = document.createElement("button");
        btnProximo.textContent = "Próximo";
        btnProximo.disabled = paginaAtual === totalPaginas;
        btnProximo.className = "btn btn-light mx-1";
        btnProximo.onclick = () => mostrarPagina(paginaAtual + 1);
        paginacaoDiv.appendChild(btnProximo);
    }

    // Inicializa a primeira página
    mostrarPagina(1);