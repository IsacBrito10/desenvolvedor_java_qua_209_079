// variaveis locais
const cpfMask = document.querySelector('#cpf');
const telefoneMask = document.querySelector('#telefone');
const cepMask = document.querySelector('#cep');
const dataNascimentoMask = document.querySelector('#dataNascimento')
const dataDesaparecimentoMask = document.querySelector('#dataDesaparecimento')

const form = document.querySelector('form');

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

//DATA DE NASCIMENTO
dataNascimentoMask.addEventListener('input', function(){
    this.value = this.value
        .replace(/\D/g, '')
        .replace(/(\d{2})(\d)/, '$1/$2')
        .replace(/(\d{2})(\d)/, '$1/$2')
});

//DATA DE DESAPARECIMENTO
dataDesaparecimentoMask.addEventListener('input', function(){
    this.value = this.value
        .replace(/\D/g, '')
        .replace(/(\d{2})(\d)/, '$1/$2')
        .replace(/(\d{2})(\d)/, '$1/$2')
});
