package com.lancamento.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lancamento.vendas.model.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long>{

}
