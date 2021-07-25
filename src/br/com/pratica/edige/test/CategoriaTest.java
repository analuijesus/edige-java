package br.com.pratica.edige.test;

import br.com.pratica.edige.model.Categoria;

public class CategoriaTest {
    public static void main(String[] args) {

        Categoria c1 = new Categoria("Ficção");
        Categoria testeCategoriaIgual = new Categoria("Ficção");

        if(c1.equals(testeCategoriaIgual)){
            System.out.println("São iguais");
        }
        else{
            System.out.println("São diferentes");
        }

        //System.out.println(c1);
    }
}
