const form = document.querySelector('form');

// arrow function
const imc = () => {
    //variaveis locais
    let peso = document.querySelector('#peso').value;
    let altura = document.querySelector('#altura').value;
    const result = (peso /(altura*altura))

    document.querySelector('#result').innerHTML = `${result.toFixed(2)}`;
}
//EVENTO

form.addEventListener(`submit`, function(event){
    // desativa o evento
    event.preventDefault();

    // executa o evento
    imc();
});