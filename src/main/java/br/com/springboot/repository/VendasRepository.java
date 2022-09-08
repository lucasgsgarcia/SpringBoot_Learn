package br.com.springboot.domain.repository;

import br.com.springboot.domain.entity.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendasRepository extends JpaRepository<Venda, Long> {
    Venda findById(long id);
}