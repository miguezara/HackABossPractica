package com.example.EjercicioGestionComida.model;

import java.util.List;

public class Pedido {

    private Long id;
    private String estado;
    private String cliente;
    private List<Plato> platos;

    public Pedido(Long id, String estado, String cliente, List<Plato> platos) {
        this.id = id;
        this.estado = estado;
        this.cliente = cliente;
        this.platos = platos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(List<Plato> platos) {
        this.platos = platos;
    }
}

