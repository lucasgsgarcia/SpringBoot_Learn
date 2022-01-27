package br.com.springboot.service;


import br.com.springboot.objects.Carro;
import br.com.springboot.repository.CarrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Gera validações, relatórios, tem objeto que acessa a base de dados indiretamente.

@Service
public class CarrosService {

    @Autowired
    private CarrosRepository repository;

    public void salvarCarro(Carro carro){
        validarCarro(carro);
        this.repository.persistir(carro);
    }

    public void validarCarro(Carro carro){
    }
}
