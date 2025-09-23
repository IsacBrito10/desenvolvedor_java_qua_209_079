programa {
  funcao inicio() {
    // declaração de variáveis:
    cadeia nomes[10]
    inteiro idades[10]

    // entrada de dados
    para (inteiro i = 0; i < 10; i++)
    {
      escreva("Informe o ", i+1, "° nome do usuário: ")
      leia(nomes[i])
      escreva("Informe a idade do ", i+1, "° usuário: ")
      leia(idades[i])
    }
    // saída de dados:
    para(inteiro i = 0; i <10; i++)
    {
      escreva("Nome do ", i+1, "° usuário: ", nomes[i], ".\n")
      escreva("Idade: ", idades[i], "\n")
    }
  }
}
