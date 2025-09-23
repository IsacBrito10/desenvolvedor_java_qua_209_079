const cpfMask = document.querySelector('#cpf')

//MASKS
//CPF MASK
cpfMask.addEventListener('input', function(){
    this.value=this.value
        .replace(/\D/g, '')
        .replace(/(\d{3})(\d)/, '$1.$2')
        .replace(/(\d{3})(\d)/, '$1.$2')
        .replace(/(\d{3})(\d{1,2})$/, '$1-$2');
});