package br.com.springboot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfiguration {

    @Bean
    public String appName(){
        return "Sistema de Carros";
    }
}
