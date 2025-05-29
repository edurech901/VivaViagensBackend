package com.vivaviagens.demo.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivaviagens.demo.model.Cidade;
import com.vivaviagens.demo.service.CidadeService;

@RestController
@RequestMapping("/cidade")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @GetMapping
    public List<Cidade> listar() {
        return cidadeService.listarTodas();
    }

    @PostMapping
    public Cidade salvar(@RequestBody Cidade cidade) {
        return cidadeService.salvar(cidade);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cidade> buscar(@PathVariable UUID id) {
        Cidade cidade = cidadeService.buscarPorId(id);
        return cidade != null ? ResponseEntity.ok(cidade) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable UUID id) {
        cidadeService.deletar(id);
    }
}
