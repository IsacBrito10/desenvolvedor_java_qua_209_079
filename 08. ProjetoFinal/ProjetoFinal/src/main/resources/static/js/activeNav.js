document.addEventListener("DOMContentLoaded", function () {
    // Pega a URL atual (apenas o path, sem domínio)
    let path = window.location.pathname;

    // Seleciona todos os links do navbar
    document.querySelectorAll(".navbar-nav .nav-link").forEach(link => {
      // Remove qualquer active anterior
      link.classList.remove("active");

      // Se o href do link bate com a URL atual → adiciona active
      if (link.getAttribute("href") === path) {
        link.classList.add("active");
      }
    });
  });

