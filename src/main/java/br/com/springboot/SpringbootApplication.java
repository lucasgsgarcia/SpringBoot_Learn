package br.com.springboot;

import br.com.springboot.domain.entity.Carro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@SpringBootApplication
@RestController
public class SpringbootApplication {

	public static void main(String[] args) {



		SpringApplication.run(SpringbootApplication.class, args);
	}
}
