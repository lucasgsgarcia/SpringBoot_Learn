package br.com.springboot.domain.repository;

import br.com.springboot.domain.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrosRepository extends JpaRepository<Carro, Long> {

    Carro findById(long id);
}
