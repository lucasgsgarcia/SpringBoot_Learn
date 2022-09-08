package br.com.springboot.domain.repository;

import br.com.springboot.domain.entity.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;

public interface VendedoresRepository extends JpaRepository<Vendedor, Long> {
    Vendedor findById(long id);
}
