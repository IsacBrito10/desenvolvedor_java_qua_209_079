// variaveis locais
const cpfMask = document.querySelector('#cpf');
const telefoneMask = document.querySelector('#telefone');
const cepMask = document.querySelector('#cep');
const form = document.querySelector('form');

//arrow function
const btn = () =>{
    let nome = document.querySelector('#nome').value;
    let cpf = document.querySelector('#cpf').value;
    let telefone = document.querySelector('#telefone').value;
    let cep = document.querySelector('#cep').value;
    let result = `Nome: ${nome}.<br>
                    CPF: ${cpf}.<br>
                    Telefone: ${telefone}.<br>
                    CEP: ${cep}.<br>`;

    document.querySelector('#result').innerHTML = result;
}

//MASCARA DE ENTRADA
//CPF
cpfMask.addEventListener('input', function(){
    this.value = this.value
        .replace(/\D/g, '')
        .replace(/(\d{3})(\d)/, '$1.$2')
        .replace(/(\d{3})(\d)/, '$1.$2')
        .replace(/(\d{3})(\d{1,2})$/, '$1-$2');
});
//CEP
cepMask.addEventListener('input', function(){
    this.value = this.value
        .replace(/\D/g, '')
        .replace(/(\d{5})(\d)/, '$1-$2')
});
//TELEFONE
telefoneMask.addEventListener('input', function(){
    this.value = this.value
        .replace(/\D/g, '')
        .replace(/(\d{0})(\d)/, '$1($2')
        .replace(/(\d{2})(\d)/, '$1) $2')
        .replace(/(\d{5})(\d)/, '$1-$2')
});
//SUBMIT BUTTON
form.addEventListener(`submit`, function(event) {
    // desativa o evento
    event.preventDefault();

    // executa a função
    btn();
});
