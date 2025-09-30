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

    // Troca o ícone do navbar conforme a página
    const icon = document.getElementById("navbarIcon");
    if (icon) {
        if (path === "/cadastrar") {
            icon.src = "/img/cadastrar.png";
        } 
        else if (path === "/lista") {
            icon.src = "/img/lista.png";
        }
        else if (path === "/"){
            icon.src = "/img/desaparecimento.png";
        }
    }
});