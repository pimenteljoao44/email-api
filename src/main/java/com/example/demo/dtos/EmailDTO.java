package com.example.demo.dtos;

public class EmailDTO {

    private String name;
    private String email;
    private String message;

    public EmailDTO() {
    }
    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMensagem() {
        return message;
    }

    public void setMensagem(String mensagem) {
        this.message = mensagem;
    }
}
