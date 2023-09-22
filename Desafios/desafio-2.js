// Entrada da quantidade de ativos
const quantidadeAtivos = parseInt(gets());

//Entrada dos tipos de ativos
const ativos = [ ];
for (let i = 0; i < quantidadeAtivos; i++) {
  const codigoAtivo = gets();
  ativos.push(codigoAtivo);
}

//TODO: Ordenar os ativos em ordem alfabética.
ativos.sort();
//TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
for (let i = 0; i < quantidadeAtivos; i++) {
  console.log(ativos[i]);
}
