package br.com.springboot.domain.services;

import br.com.springboot.domain.entity.Carro;
import br.com.springboot.domain.entity.Vendedor;
import br.com.springboot.domain.repository.CarrosRepository;
import br.com.springboot.domain.repository.VendedoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/vendedores")
public class VendedoresServices {

    @Autowired
    VendedoresRepository vendedoresRepository;

    @GetMapping("/lista")
    public List<Vendedor> listaVendedores(){
        return vendedoresRepository.findAll();
    }

    @GetMapping("/vendedor/{id}")
    public Vendedor listaVendedorUnico(@PathVariable(value = "id") long id){
        return vendedoresRepository.findById(id);
    }

    @PostMapping("/adicionar")
    public Vendedor salvaVendedor(@RequestBody Vendedor vendedor){
        return vendedoresRepository.save(vendedor);
    }

    @DeleteMapping("/remover")
    public void deletaVendedor(@RequestBody Vendedor vendedor){
        vendedoresRepository.delete(vendedor);
    }

    @PutMapping("/atualizar")
    public Vendedor atualizarVendedor(@RequestBody Vendedor vendedor){
        return vendedoresRepository.save(vendedor);
    }
}
