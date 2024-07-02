/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */
$(document).ready(function () {
// Função para carregar as tarefas da API e exibi-las na tela 

    function carregarTarefas() {
        $.ajax({
            url: 'http://localhost:8080/tarefas',
            method: 'GET',
            success: function (data) {
// Limpa a tabela de tarefas 
                $('#tabelaTarefas tbody').empty();
// Adiciona cada tarefa à tabela 
                for (let i = 0; i < data.length; i++) {
                    let tarefa = data[i];
                    let checkbox = $('<input>')
                            .attr('type', 'checkbox')
                            .prop('checked', tarefa.completa)
                            .change(function () {
                                atualizarTarefa($(this).parent().parent().attr('data-id'), {
                                    descricao: tarefa.descricao,
                                    completa: $(this).prop('checked')
                                });
                            });
                    let id = $('<td>')
                            .text(tarefa.id);
                    let descricao = $('<input>')
                            .attr('type', 'text')
                            .val(tarefa.descricao)
                            .blur(function () {
                                atualizarTarefa($(this).parent().attr('data-id'), {
                                    descricao: $(this).val(),
                                    completa: tarefa.completa
                                });
                            });
                    let concluida = $('<td>')
                            .append(checkbox);
                    let botaoDeletar = $('<button>')
                            .text('Excluir')
                            .click(function () {
                                deletarTarefa($(this).parent().parent().attr('data-id'));
                            });
                    let excluir = $('<td>')
                            .append(botaoDeletar);
                    let tr = $('<tr>')
                            .attr('data-id', tarefa.id)
                            .append(id)
                            .append(descricao)
                            .append(concluida)
                            .append(excluir);
                    $('#tabelaTarefas tbody').append(tr);
                }
            },
            error: function () {
                alert('Não foi possível carregar as tarefas da API.');
            }
        });
    }
    
    

//Função para criar uma nova tarefa na API 
    function criarTarefa(tarefa) {
        $.ajax({
            url: 'http://localhost:8080/tarefas',
            method: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(tarefa),
            success: function (data) {
// Limpa o formulário e recarrega a lista de tarefas 
                $('#descricao').val('');
                carregarTarefas();
            },
            error: function () {
                alert('Não foi possível criar a tarefa na API.');
            }
        });
    }
// Adiciona uma tarefa ao enviar o formulário 
    $('#formCriarTarefa').submit(function (event) {
        event.preventDefault();
        let descricao = $('#descricao').val();
        if (!descricao) {
            alert('Por favor, preencha a descrição da tarefa.');
            return;
        }
        let tarefa = {
            descricao: descricao,
            completa: false
        };
        criarTarefa(tarefa);
    });
    
    
    
// Atualiza uma tarefa na API 
    function atualizarTarefa(id, tarefa) {
        $.ajax({
            url: 'http://localhost:8080/tarefas/' + id,
            method: 'PUT',
            contentType: 'application/json',
            data: JSON.stringify({
                descricao: tarefa.descricao,
                completa: tarefa.completa
            }),
            success: function (data) {
// Recarrega a lista de tarefas 
                alert('Tarefa atualizada na API com sucesso!');
                carregarTarefas();
            },
            error: function () {
                alert('Não foi possível atualizar a tarefa na API.');
            }
        });
    }
    
    
    
// Deleta uma tarefa na API 
    function deletarTarefa(id) {
        $.ajax({
            url: 'http://localhost:8080/tarefas/' + id,
            method: 'DELETE',
            success: function (data) {
                alert('Tarefa removida na API com sucesso!');
// Recarrega a lista de tarefas 
                carregarTarefas();
            },
            error: function () {
                alert('Não foi possível deletar a tarefa na API.');
            }
        });
    }
    
    
    
// Carrega as tarefas ao abrir a página 
    carregarTarefas();
    
    
    
});