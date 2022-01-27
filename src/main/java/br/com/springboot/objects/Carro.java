package br.com.springboot.objects;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class Carro {

    @Getter @Setter(AccessLevel.PROTECTED) private String nome;

    @Getter @Setter(AccessLevel.PROTECTED) private String placa;

}
