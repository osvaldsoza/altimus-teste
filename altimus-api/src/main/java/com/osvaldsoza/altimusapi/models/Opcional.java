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
@Table(name = "opcionais")
@Setter
@Getter
@EqualsAndHashCode(exclude = {"descricao"})
public class Opcional {

   @Id
   @GeneratedValue(generator = "increment")
   @GenericGenerator(name = "increment", strategy = "increment")
   private Long codigo;
   private String descricao;
}
