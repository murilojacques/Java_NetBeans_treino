/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.tarefas.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.api.tarefas.model.Tarefa;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/tarefas")
public class TarefaController {

    private final List<Tarefa> tarefas = new ArrayList<>();
    private int proximoId = 1;

    @PostMapping("")
    public Tarefa criarTarefa(@RequestBody Tarefa tarefa) {
        tarefa.setId(proximoId++);
        tarefas.add(tarefa);
        return tarefa;
    }

    @GetMapping("")
    public List buscarTarefas() {
        return tarefas;
    }

    @GetMapping("/{id}")
    public Tarefa buscarTarefa(@PathVariable int id) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == id) {
                return tarefa;
            }
        }
        return null;
    }

    @PutMapping("/{id}")
    public Tarefa atualizarTarefa(@PathVariable int id, @RequestBody Tarefa tarefa) {
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa t = tarefas.get(i);
            if (t.getId() == id) {
                t.setDescricao(tarefa.getDescricao());
                t.setCompleta(tarefa.isCompleta());
                return t;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public boolean deletarTarefa(@PathVariable int id) {
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa tarefa = tarefas.get(i);
            if (tarefa.getId() == id) {
                tarefas.remove(i);
                return true;
            }
        }
        return false;
    }
}
