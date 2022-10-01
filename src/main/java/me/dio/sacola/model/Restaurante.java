package me.dio.sacola.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String none;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Produto> cardapio;
    @Embeded
    private Endereco endereco;
}
