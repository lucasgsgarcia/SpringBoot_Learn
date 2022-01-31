package br.com.springboot.domain.services;

import br.com.springboot.domain.entity.Carro;
import br.com.springboot.domain.entity.Cliente;
import br.com.springboot.domain.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClientesServices {

    @Autowired
    ClientesRepository clientesRepository;

    @GetMapping("/lista")
    public List<Cliente> listarClientes(){
        return clientesRepository.findAll();
    }

    @GetMapping("/cliente/{id}")
    public Cliente listarClienteUnico(@PathVariable(value = "id") long id){
        return clientesRepository.findById(id);
    }

    @PostMapping("/adicionar")
    public Cliente salvarCliente(@RequestBody Cliente cliente){
        return clientesRepository.save(cliente);
    }

    @DeleteMapping("/remover")
    public void deletarCliente(@RequestBody Cliente cliente){
        clientesRepository.delete(cliente);
    }

    @PutMapping("/atualizar")
    public Cliente atualizarCliente(@RequestBody Cliente cliente){
        return clientesRepository.save(cliente);
    }
}
