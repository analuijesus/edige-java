package br.com.pratica.edige.test;

import br.com.pratica.edige.model.Autor;
import br.com.pratica.edige.model.Categoria;
import br.com.pratica.edige.model.Livro;

import java.math.BigDecimal;

public class LivroTest {
    public static void main(String[] args) {
        Autor autor = new Autor("Autor Teste", "teste@alura.com", "biografia teste");
        Categoria categoria = new Categoria("Categoria Teste");

        Livro l1 = new Livro("C#", "9780000000000", "Resumo do livro", "Sumário do livro", 100, new BigDecimal("1"), autor, categoria);

        //teste isbn com valor diferente que menos caracteres
        //Livro l2 = new Livro("C#", "978000000000", "Resumo do livro", "Sumário do livro", 100, new BigDecimal("29.90"), autor, categoria);

        //teste usbn com valores iniciais diferentes
        //Livro l3 = new Livro("C#", "1234567891234", "Resumo do livro", "Sumário do livro", 100, new BigDecimal("29.90"), autor, categoria);

        System.out.println(l1);
    }
}
