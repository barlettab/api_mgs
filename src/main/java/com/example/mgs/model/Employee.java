package com.example.mgs.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

public class Employee {
    // attributes
    @NotBlank(message = "O ID do funcionário é obrigatório.")
    private String id;

    @NotBlank(message = "O nome do funcionário é obrigatório.")
    private String nome;

    private List<String> alergia;
    private List<String> probMed;

    @NotEmpty(message = "Pelo menos um número de telefone é obrigatório.")
    private List<String> telefone;

    @NotEmpty(message = "Pelo menos um e-mail é obrigatório.")
    @Email(message = "E-mail deve ser válido.")
    private List<String> email;

    // constructor
    public Employee(String id, String nome, List<String> alergia, List<String> probMed, List<String> telefone, List<String> email) {
        this.id = id;
        this.nome = nome;
        this.alergia = alergia;
        this.probMed = probMed;
        this.telefone = telefone;
        this.email = email;
    }

    // getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getAlergia() {
        return alergia;
    }

    public void setAlergia(List<String> alergia) {
        this.alergia = alergia;
    }

    public List<String> getProbMed() {
        return probMed;
    }

    public void setProbMed(List<String> probMed) {
        this.probMed = probMed;
    }

    public List<String> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<String> telefone) {
        this.telefone = telefone;
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

}