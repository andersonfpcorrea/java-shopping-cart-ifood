package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import me.dio.sacola.enumeration.FormaPagamento;

import javax.annotation.processing.Generated;
import javax.persistence.*;

public class Sacola {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JsonIgnore
    private Cliente cliente;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Item> itens;
    private Double valorTotal;

    @Enumerated
    private FormaPagamento FormaPagamento;
    private boolean fechada;
}
