/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */ 



var cells = document.querySelectorAll("#Tabela td");
for (var i = 0; i < cells.length; i++) {
  cells[i].addEventListener("click", function() {
    alert(this.innerHTML);
  });
}


//function a() {    
  //      let valor = Number(document.getElementsByClassName("id").value);
    //    alert(valor+1);
//}
