package br.com.pratica.edige.model;

import java.util.Objects;

public class Categoria {

    private String nome;

    public Categoria(String nome) {
        setNome(nome);
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Categoria inválida!");
        }

        this.nome = nome;
    }

    @Override
    public boolean equals(Object object) {
        Categoria outraCategoria = (Categoria) object;
        return nome.equals(outraCategoria.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Categoria{" + "nome=" + nome + '}';
    }
}
