package br.com.pratica.edige.model;

import java.util.Objects;

public class Autor {

    private String nome;
    private String email;
    private String biografia;

    public Autor(String nome, String email, String biografia) {
        setNome(nome);
        setEmail(email);
        setBiografia(biografia);
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido!");
        }

        this.nome = nome;
    }

    public void setEmail(String email) {
        String validacao = "^([\\w\\.\\-]+)@([\\w\\-]+)((\\.(\\w){2,3})+)$";
        boolean emailValido = email.matches(validacao);

        if(!emailValido) {
            throw new IllegalArgumentException("Email inválido!");
        }

        this.email = email;
    }

    public void setBiografia(String biografia) {
        if(biografia == null || biografia.trim().isEmpty()) {
            throw new IllegalArgumentException("Biografia inválida!");
        }

        if(biografia.length() > 100) {
            throw new IllegalArgumentException("Biografica deve conter no máximo 100 caracteres!");
        }

        this.biografia = biografia;
    }

    @Override
    public boolean equals(Object object) {
        Autor outroEmail = (Autor) object;
        return email.equals(outroEmail.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return "Autor{" + "nome=" + nome + ", email=" + email + ", biografia=" + biografia +'}';
    }
}
