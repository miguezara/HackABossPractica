package org.example;

public class Cliente {
    private String apellido;

    public Cliente(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "apellido='" + apellido + '\'' +
                '}';
    }
}
