let contador = 0;
let input = document.getElementById("inputTarefa");
let btnAdd = document.getElementById("btn-add");
let main = document.getElementById("areaLista");

function addTarefa(){
    //Pegar o valor digitado no input
    let valorInput = input.value;

    //Se não for vazio nem nulo nem indefinido
    if((valorInput != "") && (valorInput != null) && (valorInput != undefined)){
         //Adiciona 1 ao contador
         ++contador;
        
        let novoItem = `<div id="${contador}" class="item">
            <div onclick="marcarTarefa(${contador})" class="itemIcone">
                <i id="icone_${contador}" class="mdi mdi-circle-outline"></i>
            </div>

            <div onclick="marcarTarefa(${contador})" class="itemNome">
                <p>${valorInput}</p>
            </div>

            <div class="itemBotao">
                <button class="delete" onclick="deletar(${contador})"><i class="material-symbols-outlined"></i> delete</button>
            </div>

            <a href="pag2.html">pag2</a>
        </div>`;

        //Adicionar novo item no Main
        main.innerHTML += novoItem;

        //zerar os Campos
        input.value = "";
        input.focus();
    }

}


input.addEventListener("keyup", function(event){
    if(event.keyCode === 13){
        event.preventDefault();
        btnAdd.click();
    }
});



function deletar(id){
    var tarefa = document.getElementById(id);
    tarefa.remove();
}


function marcarTarefa(id){
    var item = document.getElementById(id);
    var classe = item.getAttribute('class');

    if(classe == "item"){
        item.classList.add("clicado");
        
        var icone = document.getElementById("icone_"+id);
        icone.classList.remove("mdi-circle-outline");
        icone.classList.add("mdi-check-circle");

        item.parentNode.appendChild(item);
    }
    else{
        item.classList.remove("clicado");
        
        var icone = document.getElementById("icone_"+id);
        icone.classList.remove("mdi-check-circle");
        icone.classList.add("mdi-circle-outline");
    }
}