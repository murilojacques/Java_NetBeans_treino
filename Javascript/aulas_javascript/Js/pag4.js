//Comando basico para pegar Data
let data = new Date();
console.log(data);

//Pegar o ano Atual com 4 digitos
let ano = data.getFullYear();
console.log(ano);

//Pegar o Mes Atual - de 0 até 11 (jan = 0 e dez = 11)
let mes = data.getMonth();
console.log(mes);

//Mostrar o Mes Escrito
const meseDoAno = ["Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"]
let mesEscrito = meseDoAno[mes];
console.log(mesEscrito);

//Pegar Dia do Mes - 1 Até 31
let diaMes = data.getDate();
console.log(diaMes);

//Pegar Dia da Semana - de 0 até 6 (dom = 0 e sab = 6)
let diaSemana = data.getDay();
console.log(diaSemana);

//Mostrar o Dia da Semana Escrito
const diaDaSemana = ["Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado"];
let diaDaSemanaEscrito = diaDaSemana[diaSemana];
console.log(diaDaSemanaEscrito);

//Pegar a Hora - de 0 até 23
let hora = data.getHours();
console.log(hora);

//Pegar os Minutos - de 0 até 59
let minutos = data.getMinutes();
console.log(minutos);

//Pegar Segundos - de 0 até 59
let segundos = data.getSeconds();
console.log(segundos);

//Pegar Milisegundos - de 0 até 999
let milisegundos = data.getMilliseconds();
console.log(milisegundos)


//Pegar a Data no Padrao Brasileiro - dd/mm/aaaa
let dataBr = data.toLocaleString('pt-BR');
//let dataBr = data.toLocaleString('pt-BR', {dateStyle: "short"});
//let dataBr = data.toLocaleString('pt-BR', {timeStyle: "short"});
console.log(dataBr);


//Comparar Datas - Maior ou Menor. Ex: Vencimento
var hoje = new Date();
var vencimento = new Date(2026, 3, 16);

if(hoje > vencimento){
    console.log("Sua Conta Esta Vencida");
}
else{
    console.log("Ainda Não Venceu, Tudo Certo!");
}


//Diferença Entre Duas Datas em Dias
var dataInicial = new Date();
var dataFinal = new Date(2026, 5, 19);

var diferencaTempo = dataFinal.getTime() - dataInicial.getTime();
var diferencaDias = Math.ceil(diferencaTempo / (24 * 60 * 60 * 1000));
console.log(diferencaDias); 



