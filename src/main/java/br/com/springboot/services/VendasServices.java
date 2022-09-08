package br.com.springboot.domain.services;

import br.com.springboot.domain.entity.Cliente;
import br.com.springboot.domain.entity.Venda;
import br.com.springboot.domain.repository.VendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/vendas")
public class VendasServices {


    @Autowired
    VendasRepository vendasRepository;

    @GetMapping("/lista")
    public List<Venda> listarVendas(){
        return vendasRepository.findAll();
    }

    @GetMapping("/venda/{id}")
    public Venda listarVendaUnica(@PathVariable(value = "id") long id){
        return vendasRepository.findById(id);
    }

    @PostMapping("/adicionar")
    public Venda salvarVenda(@RequestBody Venda venda){
        return vendasRepository.save(venda);
    }

    @DeleteMapping("/remover")
    public void deletarVenda(@RequestBody Venda venda){
        vendasRepository.delete(venda);
    }

    @PutMapping("/atualizar")
    public Venda atualizarVenda(@RequestBody Venda venda){
        return vendasRepository.save(venda);
    }
}
