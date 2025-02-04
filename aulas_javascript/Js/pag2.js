let tempo;

function ativarContagem(){
    //document.getElementById("tempo").innerHTML = "começou a Contar";
    
    //Ativa a função apenas uma vez apos o tempo determinado
    /*
    tempo = setTimeout(function(){
        document.getElementById("tempo").innerHTML = "executou o SetTimeout";
        document.body.style.backgroundColor =  "lightblue"
    } , 5000)
     */

    tempo = setInterval(function(){
        var cronometro = document.getElementById("tempo").innerHTML;
        var soma = parseInt(cronometro) + 1;
        if(soma <= 5){
            document.getElementById("tempo").innerHTML = soma;
        }
        else{
            pararContagem();
        }
       
    }, 1000)
}


function pararContagem(){
    clearTimeout(tempo);
    //document.getElementById("tempo").innerHTML = "Parou a contagem";
}