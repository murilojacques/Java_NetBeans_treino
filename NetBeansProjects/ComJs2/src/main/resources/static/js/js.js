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


function addForm(){
    let div = document.getElementById("divForm");
    
    alert("Funcionou 2");
    console.log("Funcionou 2");
    
    div.innerHTML += `
        <p><b>Nome: </b><input type="text" th:field="*{nome}" placeholder="nome"></p>
        <p><b>Idade: </b><input type="text" th:field="*{idade}" placeholder="idade"></p>
        <p><b>Email: </b><input type="text" th:field="*{email}" placeholder="email"></p>
        <button type="submit" class="btn btn-success">Cadastrar</button> `;
}