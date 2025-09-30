 // Abre o overlay e seta a action do formulário com o id do usuário
  function confirmar(idDesaparecido) {
    document.getElementById("formExclusao").action = idDesaparecido + "/excluir";
    document.getElementById("overlay").style.display = "block";
  }

  // Fecha o overlay
  function fechar() {
    document.getElementById("overlay").style.display = "none";
  }
