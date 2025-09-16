const usuariosData = document.getElementById('usuarios-data').textContent.trim();
const usuarios = JSON.parse(usuariosData);

const usuariosPorPagina = 10;
let paginaAtual = 1;

const tbody = document.getElementById('usuarios-tbody');
const btnAnterior = document.getElementById('btn-anterior');
const btnProximo = document.getElementById('btn-proximo');
const spanPaginaAtual = document.getElementById('pagina-atual');

const totalPaginas = Math.ceil(usuarios.length / usuariosPorPagina);

function renderizarTabela() {
  tbody.innerHTML = '';

  const inicio = (paginaAtual - 1) * usuariosPorPagina;
  const fim = inicio + usuariosPorPagina;
  const usuariosPagina = usuarios.slice(inicio, fim);

  usuariosPagina.forEach(usuario => {
    const tr = document.createElement('tr');
    tr.innerHTML = `
      <td>${usuario.idPessoa}</td>
      <td>${usuario.nome}</td>
      <td>${usuario.cpf}</td>
      <td>${usuario.email}</td>
      <td>
        <button class="btn-alterar btn-sm me-2">Alterar</button>
        <button class="btn-excluir btn-sm">Excluir</button>
      </td>
    `;
    tbody.appendChild(tr);
  });
}

function atualizarControles() {
  spanPaginaAtual.textContent = paginaAtual;

  btnAnterior.disabled = paginaAtual === 1;
  btnProximo.disabled = paginaAtual === totalPaginas;
}

// Eventos dos botões
btnAnterior.addEventListener('click', () => {
  if (paginaAtual > 1) {
    paginaAtual--;
    renderizarTabela();
    atualizarControles();
  }
});

btnProximo.addEventListener('click', () => {
  if (paginaAtual < totalPaginas) {
    paginaAtual++;
    renderizarTabela();
    atualizarControles();
  }
});

// Inicialização
renderizarTabela();
atualizarControles();
