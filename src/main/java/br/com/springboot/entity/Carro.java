package br.com.springboot.domain.entity;

import lombok.*;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@HashCodeAndEqualsPlugin.Enhance
@ToString
@AllArgsConstructor
@Entity
@Table(name = "Carro")
@Getter
@Setter
@NoArgsConstructor
public class Carro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "preco")
    private BigDecimal preco;

}
