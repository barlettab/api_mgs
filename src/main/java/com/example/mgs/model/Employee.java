package com.example.mgs.model;

import java.util.List;

public class Employee {
    // attributes
    private String id;
    private String nome;
    private List<String> alergia;
    private List<String> probMed;
    private String telefone;
    private String email;

    // constructor
    public Employee(String id, String nome, List<String> alergia, List<String> probMed, String telefone, String email) {
        super();
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

    /*
    // toString para impressão de informações do funcionário
    @Override
    public String toString() {
        return "Employee [id=" + id + ", nome=" + nome + ", alergia=" + alergia + ", probMed=" + probMed + ", telefone="
                + telefone + ", email=" + email + "]";
    }
    */
}
	