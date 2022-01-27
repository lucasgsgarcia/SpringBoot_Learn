package br.com.springboot.repository;


import br.com.springboot.objects.Carro;
import org.springframework.stereotype.Repository;

// Essa classe acessará a base de dados

@Repository
public class CarrosRepository {

    public void persistir(Carro carro) {
        // acessa db e salva o cliente
    }
}
