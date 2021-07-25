package br.com.pratica.edige.test;

import br.com.pratica.edige.model.Autor;

public class AutorTest {

    public static void main(String[] args) {

        Autor a1 = new Autor("Ana", "ana@alura.com", "futura dev");
        Autor a2 = new Autor("Gui", "gui@alura.com", "javeiro raiz");

        Autor testeEmailIguais = new Autor("Luiza", "ana@alura.com", "csharpeira");

        //Autor testeEmail = new Autor("Camis", "camis.com", "dev nodejs");

        //System.out.println(testeEmail);

        if(a1.equals(testeEmailIguais)){
            System.out.println("São iguais!");
        }
        else {
            System.out.println("São diferentes!");
        }

        System.out.println(a1);
    }
}
