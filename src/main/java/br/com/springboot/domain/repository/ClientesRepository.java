package br.com.springboot.domain.repository;

import br.com.springboot.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<Cliente, Long> {
    Cliente findById(long id);
}
