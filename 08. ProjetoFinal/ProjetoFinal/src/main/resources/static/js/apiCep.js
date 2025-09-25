// variáveis globais
const pesquisaCep = document.querySelector('#cep');

// arrow functions
const limpa_formulario_cep = () => {
    // limpa valores do formulário
    document.querySelector('#estado').value = ("");
    document.querySelector('#cidade').value = ("");
    document.querySelector('#bairro').value = ("");
    document.querySelector('#logradouro').value = ("");
}

const meu_callback = (conteudo) => {
    if (!("erro" in conteudo)) {
        document.querySelector('#estado').value = (conteudo.uf);
        document.querySelector('#cidade').value = (conteudo.localidade);
        document.querySelector('#bairro').value = (conteudo.bairro);
        document.querySelector('#logradouro').value = (conteudo.logradouro);
    }
    else {
        // CEP não encontrado
        limpa_formulario_cep();
        alert("CEP não encontrado.");
    }
}

// eventos
pesquisaCep.addEventListener('blur', function() {
    // cep somente com dígitos
    let cep = document.querySelector('#cep').value.replace(/\D/g, '');

    // cep tem valor informado
    if (cep != "") {
        // variavel de validação do CEP
        let validarCep = /^[0-9]{8}$/;

        // valida o cep
        if (validarCep.test(cep)) {
            document.querySelector('#estado').value = "...";
            document.querySelector('#cidade').value = "...";
            document.querySelector('#bairro').value = "...";
            document.querySelector('#logradouro').value = "...";

            // cria um elemento js
            let script = document.createElement('script');

            // sincroniza o callback
            script.src = 'https://viacep.com.br/ws/' + cep + '/json/?callback=meu_callback';

            // insere o script no documento e carrega o conteúdo
            document.body.appendChild(script);
        }
        else {
            limpa_formulario_cep();
            alert("Formato do CEP inválido.")
        }
    }
    else {
        // limpa formulário
        limpa_formulario_cep();
    }
});