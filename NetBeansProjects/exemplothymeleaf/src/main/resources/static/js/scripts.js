/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */

function atualizarTarefa(element) { 
    if (element.innerHTML === 'Concluída') { 
    element.innerHTML = 'Pendente'; 
    element.className = 'tarefa-pendente'; 
    } else { 
    element.innerHTML = 'Concluída'; 
    element.className = 'tarefa-concluida'; 
    } 
}
