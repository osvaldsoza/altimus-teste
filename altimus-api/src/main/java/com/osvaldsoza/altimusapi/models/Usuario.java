package com.osvaldsoza.altimusapi.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
@Setter
@Getter
@EqualsAndHashCode(exclude = {"login", "senha"})
public class Usuario {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Integer codigo;
    private String login;
    private String senha;
}
