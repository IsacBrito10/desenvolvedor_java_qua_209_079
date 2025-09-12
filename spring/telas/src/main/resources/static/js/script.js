const btn = document.querySelector('form');
const pesquisaCEP = document.querySelector('#cep');

btn.addEventListener('submit', function(event){
    event.preventDefault();

    let nome = document.querySelector('#nome').value;
    let telefone = document.querySelector('#telefone').value;
    let cep = document.querySelector('#cep').value;
    let estado = document.querySelector('#estado').value;
    let cidade = document.querySelector('#cidade').value;
    let bairro = document.querySelector('#bairro').value;
    let logradouro = document.querySelector('#logradouro').value;
    let complemento = document.querySelector('#complemento').value;
    let numero = document.querySelector('#numero').value;

    let result = `<br>DADOS DO USUÁRIO:<br><br>
    Nome: ${nome}<br>
    Telefone: ${telefone}<br>
    CEP: ${cep}<br>
    Estado: ${estado}<br>
    Cidade: ${cidade}<br>
    Bairo: ${bairro}<br>
    Logradouro: ${logradouro}<br>
    Complemento: ${complemento}<br>
    Numero: ${numero}<br>`;
    document.querySelector('#result').innerHTML = result;

    btn();
})

const limpa_formulario_cep = () => {
    document.querySelector('#estado').value("");
    document.querySelector('#cidade').value("")
    document.querySelector('#bairro').value("")
    document.querySelector('#logradouro').value("")

}

const meu_callback = (conteudo) => {
    if (!("erro" in conteudo)) {
        document.querySelector('#estado').value=(conteudo.uf);
        document.querySelector('#cidade').value=(conteudo.localidade);
        document.querySelector('#bairro').value=(conteudo.bairro);
        document.querySelector('#logradouro').value=(conteudo.logradouro);

    }
    else{
        // CEP Não encontrado
        limpa_formulario_cep();
        alert("CEP não encontrado");
    }
}

// Eventos
pesquisaCEP.addEventListener('blur', function() {
    // cep somente com digitos
    let cep = document.querySelector('#cep').value.replace(/\D/g, '');

    if (cep != ""){
        // variavel de validacao CEP
        let validarCep = /^[0-9]{8}$/;

        //validar o cep
        if (validarCep.test(cep)){
            document.querySelector('#estado').value = "...";
            document.querySelector('#cidade').value = "...";
            document.querySelector('#bairro').value = "...";
            document.querySelector('#logradouro').value = "...";

            // cria um elemento js 
            let script = document.createElement('script');

            // sincroniza o callback
            script.src = 'https://viacep.com.br/ws/' + cep + '/json/?callback=meu_callback';

            //inserir o script no documento e carregar o conteudo
            document.body.appendChild(script);

        }
        else{
            limpa_formulario_cep();
            alert("Formato do CEP invalido")
        }
    }
    else{
        limpa_formulario_cep();
    }
});