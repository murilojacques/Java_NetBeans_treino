/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */

function funcao(){
    let div = document.getElementById("content");
    
    alert("Funcionou");
    console.log("Funcionou");
    
    div.innerHTML += `<a href="@{/pag2}">aaaaaa</a>
    <h1 th:text="">bbbbbbb</h1>`;
}
