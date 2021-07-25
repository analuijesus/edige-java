package br.com.pratica.edige.model;

import java.math.BigDecimal;

public class Livro {

    private String titulo;
    private String isbn;
    private String resumo;
    private String sumario;
    private Integer numeroPaginas;
    private BigDecimal preco;
    private Autor autor;
    private Categoria categoria;


    public Livro(String titulo, String isbn, String resumo, String sumario, Integer numeroPaginas, BigDecimal preco, Autor autor, Categoria categoria) {
        setTitulo(titulo);
        setIsbn(isbn);
        setResumo(resumo);
        setSumario(sumario);
        setNumeroPaginas(numeroPaginas);
        this.preco = preco;
        this.autor = autor;
        this.categoria = categoria;
    }

    public void setTitulo(String titulo) {
        if(titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Título inválida!");
        }

        this.titulo = titulo;
    }

    public void setIsbn(String isbn) {
        boolean validaIsbn = isbn.startsWith("978");

        if(!validaIsbn || isbn.length() != 13){
            throw new IllegalArgumentException("ISBN inválido!");
        }

        this.isbn = isbn;
    }

    public void setResumo(String resumo) {
        if(resumo == null || resumo.trim().isEmpty()) {
            throw new IllegalArgumentException("Resumo inválido!");
        }

        if(resumo.length() > 500) {
            throw new IllegalArgumentException("O resumo deve conter no máximo 500 caracteres!");
        }

        this.resumo = resumo;
    }

    public void setSumario(String sumario) {
        if(sumario == null || sumario.trim().isEmpty()) {
            throw new IllegalArgumentException("Sumário inválido!");
        }

        this.sumario = sumario;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        if(numeroPaginas < 1){
            throw new IllegalArgumentException("Quantidade de páginas inválido!");
        }

        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo=" + titulo + '\'' +
                ", isbn=" + isbn + '\'' +
                ", resumo=" + resumo + '\'' +
                ", sumario=" + sumario + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", preco=" + preco +
                ", autor=" + autor +
                ", categoria=" + categoria +
                '}';
    }
}
