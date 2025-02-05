
/*
//Objeto Carro
const carro = {
    marca: "Fiat",
    modelo: "Uno",
    motor: ["1.6", "1.4", "1.0"]
}

//Converteu para Texto JSON
let texto = JSON.stringify(carro);
//Colocou o Texto no Nosso HTML
document.getElementById("area").innerHTML = texto;

//Converteu o Texto do HTML para Objeto
let obj = JSON.parse(texto);
//Pegamos um Valor Desse Objeto
console.log(obj.modelo);
console.log(obj.motor[2]);
*/



const ajax = new XMLHttpRequest();
ajax.open('GET', 'https://viacep.com.br/ws/01008000/json/');
ajax.send();

ajax.onload = function(){
    document.getElementById("area").innerHTML = this.responseText;
    let obj = JSON.parse(this.responseText);
    alert(obj.ddd);
}






function buscarCEP(){
    let input = document.getElementById("cep").value;

    const ajax = new XMLHttpRequest();
    ajax.open('GET', "https://viacep.com.br/ws/"+ input +"/json/");
    ajax.send();

    ajax.onload = function(){
        //document.getElementById("texto").innerHTML = this.responseText;
        let obj = JSON.parse(this.responseText);

        let logradouro = obj.logradouro;
        let cidade = obj.cidade;
        let estado = obj.estado;

        document.getElementById("texto").innerHTML = "Logradouro: " + logradouro + "<br> Cidade: " + cidade + "<br> Estado: " + estado;
    }
}