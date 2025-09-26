document.addEventListener("DOMContentLoaded", function () {
    const anoAtual = new Date().getFullYear();

    // Converte dd/mm/aaaa para objeto Date
    function parseData(dataStr) {
        const [dia, mes, ano] = dataStr.split("/").map(Number);
        return new Date(ano, mes - 1, dia); // JS usa mês 0-11
    }

    // Valida campo genérico (considerando a máscara dd/mm/aaaa)
    function validarData(inputId, erroId) {
        const input = document.getElementById(inputId);
        const erro = document.getElementById(erroId);

        input.addEventListener("input", function () {
            const valor = this.value;

            // só valida se o campo estiver completo (10 caracteres com as barras)
            if (valor.length < 10) {
                erro.style.display = "none";
                return;
            }

            // regex para formato dd/mm/aaaa
            const regex = /^(0[1-9]|[12][0-9]|3[01])\/(0[1-9]|1[0-2])\/\d{4}$/;

            if (!regex.test(valor)) {
                erro.textContent = "Data inválida. Use dd/mm/aaaa";
                erro.style.display = "inline";
                return;
            }

            const [dia, mes, ano] = valor.split("/").map(Number);

            // validação extra de dia/mês/ano
            let valido = true;

            // dias por mês (considerando fevereiro bissexto)
            const diasNoMes = new Date(ano, mes, 0).getDate();

            if (dia < 1 || dia > diasNoMes) valido = false;
            if (mes < 1 || mes > 12) valido = false;
            if (ano < 1900 || ano > anoAtual) valido = false;

            if (!valido) {
                erro.textContent = `Data inválida. O ano deve ser entre 1900 e ${anoAtual}, e o mês/dia devem ser válidos.`;
                erro.style.display = "inline";
            } else {
                erro.style.display = "none";
                verificarRelacaoDatas(); // <<< chamada extra para consistência entre as duas datas
            }
        });
    }

    // Verifica se nascimento é maior que desaparecimento (data completa)
    function verificarRelacaoDatas() {
        const nascimento = document.getElementById("dataNascimento").value;
        const desaparecimento = document.getElementById("dataDesaparecimento").value;
        const erroNascimento = document.getElementById("erroDataNascimento");

        if (nascimento.length === 10 && desaparecimento.length === 10) {
            const dataNasc = parseData(nascimento);
            const dataDesap = parseData(desaparecimento);

            if (dataNasc > dataDesap) {
                erroNascimento.textContent = "Impossível a data de nascimento ser maior que a de desaparecimento.";
                erroNascimento.style.display = "inline";
            }
        }
    }

    // Chama a função para cada campo
    validarData("dataNascimento", "erroDataNascimento");
    validarData("dataDesaparecimento", "erroDataDesaparecimento");
});



