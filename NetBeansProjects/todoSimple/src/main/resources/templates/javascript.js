/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */


/* global let */

const url = "http://localhost:8080/task/user/2";
const url1 = "file:///C:/Users/Murilo/Documents/NetBeansProjects/todoSimple/src/main/resources/templates/index.html";


function hideLoader(){
    document.getElementById("loading").style.display="none";
}


function show(tasks){
    let tab = `<thead>
                <th scope="col">#</th>
                <th scope="col">Description</th>
                <th scope="col">Username</th>
                <th scope="col">User Id</th>
              </thead>`;
    
    for (let task of tasks) {
        tab += `<tr>
                    <td scope="row">${task.id}</td>
                    <td scope="row">${task.description}</td>
                    <td scope="row">${task.user.username}</td>
                    <td scope="row">${task.user.id}</td>
               </tr>`;
    }
    
    document.getElementById("tasks").innerHTML = tab;
}


async function getAPI(url){
    const response = await fetch(url, {method: "GET"});
    
    var data = await response.json();
    console.log(data);
    if(response){
        hideLoader(); 
    }
    show(data);
}


getAPI(url);