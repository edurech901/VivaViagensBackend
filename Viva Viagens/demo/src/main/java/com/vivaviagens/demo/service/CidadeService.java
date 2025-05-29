package com.vivaviagens.demo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivaviagens.demo.model.Cidade;
import com.vivaviagens.demo.repository.CidadeRepository;

@Service
public class CidadeService {
    @Autowired
    private CidadeRepository cidadeRepository;

    public List<Cidade> listarTodas() {
        return cidadeRepository.findAll();
    }

    public Cidade salvar(Cidade cidade) {
        return cidadeRepository.save(cidade);
    }

    public Cidade buscarPorId(UUID id) {
        return cidadeRepository.findById(id).orElse(null);
    }

    public void deletar(UUID id) {
        cidadeRepository.deleteById(id);
    }
}
