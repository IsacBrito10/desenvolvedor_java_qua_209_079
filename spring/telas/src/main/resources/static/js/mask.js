const cpfMask = document.querySelector('#cpf');
const cepMask = document.querySelector('#cep');
const telefoneMask = document.querySelector('#telefone');

//MASKS
//CPF MASK
cpfMask.addEventListener('input', function() {
    this.value = this.value
        .replace(/\D/g, '')
        .replace(/(\d{3})(\d)/, '$1.$2')
        .replace(/(\d{3})(\d)/, '$1.$2')
        .replace(/(\d{3})(\d{1,2})$/, '$1-$2');
});

//CEP MASK
cepMask.addEventListener('input', function() {
    this.value = this.value
        .replace(/\D/g, '')
        .replace(/(\d{5})(\d)/, '$1-$2')
        .replace(/(-\d{3})\d+?$/, '$1');
});

//TELEFONE MASK
telefoneMask.addEventListener('input', function(){
    this.value = this.value
        .replace(/\D/g, '')
        .replace(/(\d{0})(\d)/, '$1($2')
        .replace(/(\d{2})(\d)/, '$1) $2')
        .replace(/(\d{5})(\d)/, '$1-$2')
});
