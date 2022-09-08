package br.com.springboot.domain.repository;

import br.com.springboot.domain.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuariosRepository extends JpaRepository<Usuario, Long> {

    Usuario findByUsername(String username);

}

