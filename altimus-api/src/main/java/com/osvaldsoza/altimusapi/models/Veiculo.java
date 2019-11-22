package com.osvaldsoza.altimusapi.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "veiculos")
@Setter
@Getter
@EqualsAndHashCode(exclude = {"placa", "marca", "modelo", "anoModelo", "quilometragem"})
public class Veiculo {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long codigo;

    private String placa;

    private String marca;

    private String modelo;

    @Column(name = "ano_modelo")
    private String anoModelo;

    private Float quilometragem;

//    @ManyToMany
//    @JoinColumn(name = "codigo_opcionais")
//    private List<Opcional> opcionais;
}
