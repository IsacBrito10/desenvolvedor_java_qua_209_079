programa {
  funcao inicio() {
    // declaração das variáveis:
    cadeia nome
    cadeia genero
    inteiro idade

    // entrada de dados:
    escreva("Informe seu nome: ")
    leia(nome)
    escreva("Informe seu genero: ")
    leia(genero)
    escreva("Informe sua idade: ")
    leia(idade)

    // verificação de aposentadoria
    se(genero == "masculino" e idade >= 65)
    {
      escreva(nome, " pode se aposentar.")
    }
    senao se(genero == "feminino" e idade >= 62)
    {
      escreva(nome, " pode se aposentar.")
    }
    senao{
      escreva(nome, " não pode se aposentar.")
    }
  }
}
