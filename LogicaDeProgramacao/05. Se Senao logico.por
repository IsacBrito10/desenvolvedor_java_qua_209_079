programa {
  funcao inicio() {
    // declaração de variáveis
    cadeia nome
    inteiro idade
    real altura

    // entrada de dados
    escreva("Informe seu nome:")
    leia(nome)
    escreva("Informe sua idade:")
    leia(idade)
    escreva("Informe sua altura em metros:")
    leia(altura)

    // verificar a idade e a altura
    se(idade >=12 e altura >= 1.15)
    {
      escreva(nome, " está autorizado a entrar no Trem Fantasma.")
    }
   senao
   {
    escreva(nome, " não está autorizado a entrar no Trem Fantasma.")
   }
  }
}
