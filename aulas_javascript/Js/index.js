function eventoClique(){
    alert("Acionou evento onclick");
    document.body.style.backgroundColor = "blue"
}

function eventoDblClique(){
    alert("Acionou evento ondblclick")
}

function mudaCorV(){
    let div = document.getElementById("teste");
    div.style.backgroundColor = "red";
    //document.getElementById("teste").style.backgroundColor = "red";
}

function mudaCorA(){
    let div = document.getElementById("teste");
    div.style.backgroundColor = "cornflowerblue";
    //document.getElementById("teste").style.backgroundColor = "blue";
}

function adicionaTexto(){
    let p = document.getElementById("texto");
    p.append("SALVE VEI")
}


function inputEmFoco(){
    document.getElementById("campoTexto").value = "";
    //let input = document.getElementById("campoTexto");
    //input.style.backgroundColor = "orange";
}

function inputPerdeFoco(){
    document.getElementById("campoTexto").value = "SALVE MANO";
}

function onChange(){
    console.log("mudou");
}


function teclaPressionada(){
    let input = document.getElementById("campoTexto").value;
    console.log(input)
}


function verificar(){
    let nome = document.getElementById("campoTexto").value;
    let p = document.getElementById("teste");

    if(nome == "" || nome == null){
        p.innerHTML = "O campo não pode ser Vazio";
        p.style.color = "red";
    }
    else{
        p.innerHTML = nome; 
        p.style.color = "lightgreen";
    }
    
}

function verificarCor(){
    let cor  = document.getElementById("cor").value;
    cor = cor.toLowerCase();
    //var dia =  new Date().getDate();
        //dia
    switch(cor){
        case "blue":
            document.body.style.backgroundColor = "blue";
            break;
        
        case "red":
            document.body.style.backgroundColor = "red";
            break;

        case "green":
            document.body.style.backgroundColor = "green";
            break;

        case "yellow":
            document.body.style.backgroundColor = "yellow";
        break;

        case "white":
            document.body.style.backgroundColor = "white";
        break;

        case "black":
            document.body.style.backgroundColor = "black";
        break;

        case "gray":
            document.body.style.backgroundColor = "gray";
        break;

        default:
            document.getElementById("teste").innerHTML = "Nenhuma cor disponivel para: " + cor;
        break;

    }
}


function numeroFunc(){

    for(let i = 0; i<=100; i++){
        //console.log(i);
        document.getElementById("teste").innerHTML += i + ", ";
    }
}

function MostrarLista(){

    for(let i=0; i<superLista.length; i++){
        document.getElementById("texto").innerHTML += superLista[i] + ", ";
    }
}



var ano = new Date().getFullYear();
for(let i= ano; i>=1900; i--){
    document.getElementById("ano").innerHTML += "<option value ='"+i+"'>"+i+"</option>";
}




/**
 * const carro = {
    marca:"Ford",
    model:"Ka",
    ano:2019,
    placa:"ABC-1234",
    buzina: function() { alert("BIiiiiiiiiiii") },
    completo: function() {
        return "A marca é: " + this.marca  + ", o modelo é: " + this.model + " e o Ano é: " + this.ano;
    }
};


//console.log(carro["model"]);
console.log(carro.completo());
 */






const lista = ["Leite", "Ervilha", "Brocolis", "Feijão", "Macarrão", "Arroz"];
const lista2 = ["Suco", "Refrigerante", "Energetico"];
const lista3 = ["Salgadinho", "Chocolate", "Bolacha", "Yakult", "Goiaba"];
const numeros = [40, 100, 1, 5, 25, 10];
const numeroMaior20 = numeros.filter(filtragem);


const superLista = lista.concat(lista2, lista3);
const Goats = superLista.slice(3, 12);

//alert(lista.length);
//alert(lista[lista.length - 1])

/*
lista.push("bife");
alert(lista[lista.length - 1])
*/

//alert(Array.isArray(lista));

//const lista = [];

//lista[0] = "arroz";

//const lista = new Array("arroz", "feijão", "macarrão", "etc...");

console.log(lista);

function MaiorNumero(array){
    return Math.max.apply(null, array);
}

function MenorNumero(array){
    return Math.min.apply(null, array);
}

function filtragem(value, index, array){
    return value > 20;
}


//lista.pop();
//lista.push("qualquer coisa");
//lista.shift();
//lista.unshift("tomate")
//delete lista[0];
//lista.splice(1, 0, "item Adicionado 1", "item Adicionado 2");
//Goats.sort();
//Goats.sort(); Goats.reverse();
numeros.sort(function(a, b){return a-b});
numeros.sort(function(a, b){return b-a});

//document.getElementById("teste").innerHTML = lista.join(" - ");
//document.getElementById("teste").innerHTML = lista2.join(" - ");
//document.getElementById("teste").innerHTML = lista3.join(" - ");
//document.getElementById("teste").innerHTML = superLista.join(" - ");
//document.getElementById("teste").innerHTML = Goats.join(" - ");
//document.getElementById("teste").innerHTML = numeros.join(" - ");
//document.getElementById("teste").innerHTML = MaiorNumero(numeros);
//document.getElementById("teste").innerHTML = MenorNumero(numeros);
document.getElementById("teste").innerHTML = numeroMaior20;








