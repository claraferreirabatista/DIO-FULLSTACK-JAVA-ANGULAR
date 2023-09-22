const saldoAtual = parseFloat(gets());
const valorDeposito = parseFloat(gets());
const valorRetirada = parseFloat(gets());

if (isNaN(valorDeposito) || isNaN(valorRetirada)) {
  console.log("Valores de depósito ou retirada inválidos");
} else {

  const saldoAtualizado = saldoAtual + valorDeposito - valorRetirada;


  console.log(`Saldo atualizado na conta: ${saldoAtualizado.toFixed(1)}`);
}
// eu tentei ficar no escopo do desafio, porem eu adicionaria uma estrutura de controle para verificar se é depoisito ou retirada, assim modificar a propria variavel saldoAtual
