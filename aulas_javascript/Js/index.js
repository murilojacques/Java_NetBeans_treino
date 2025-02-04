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
    div.style.backgroundColor = "blue";
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



const lista = ["arroz", "feijão", "macarrão", "leite"];
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