package com.example.bancodedados;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Aluno implements Serializable {

    // Atributos
    private Integer id;
    private String nome;
    private String cpf;
    private String telefone;

    private String email;
    private String senha;

    // Getter's and Setter's
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Sobrescrevendo o metodo toString() para uma vizualização melhor dos Alunos.
    @Override
    public String toString() {
        return nome;

    }
}
