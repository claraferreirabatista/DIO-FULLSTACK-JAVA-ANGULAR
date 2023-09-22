// Entrada de dados
let saldoTotal = parseInt(gets());
let valorSaque = parseInt(gets());

// Verificar se o saldo é suficiente para o saque
if (valorSaque <= saldoTotal) {
  // Se o saldo for suficiente, realizar o saque e atualizar o saldo
  let saldo = saldoTotal - valorSaque;
  console.log(`Saque realizado com sucesso! Novo saldo: ${saldo}`);
} else {
  // Se o saldo for insuficiente, exibir a mensagem de saldo insuficiente
  console.log("Saldo insuficiente. Saque nao realizado!");
}
