package br.com.springboot.domain.services;

import br.com.springboot.domain.entity.Carro;
import br.com.springboot.domain.repository.CarrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/carros")
@ControllerAdvice
public class CarrosServices {

    @Autowired
    CarrosRepository carrosRepository;

    @GetMapping("/lista")
    public List<Carro> listaCarros(){
        return carrosRepository.findAll();
    }

    @GetMapping("/carro/{id}")
    public Carro listaCarroUnico(@PathVariable(value = "id") long id){
        return carrosRepository.findById(id);
    }

    @PostMapping("/adicionar")
    public Carro salvaCarro(@RequestBody Carro carro){
        return carrosRepository.save(carro);
    }

    @DeleteMapping("/remover")
    public void deletaCarros(@RequestBody Carro carro){
        carrosRepository.delete(carro);
    }

    @PutMapping("/atualizar")
    public Carro atualizarCarro(@RequestBody Carro carro){
        return carrosRepository.save(carro);
    }
}
