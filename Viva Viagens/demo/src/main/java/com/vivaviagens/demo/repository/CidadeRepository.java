package com.vivaviagens.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivaviagens.demo.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, UUID> {
}