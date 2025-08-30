package com.geladeira.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
public class Empregados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    private Integer idade;

    private Double salario;

    @Column(unique = true, nullable = false, length = 11)
    private String cpf;


    private String cargo;
    private String endereco;

    public Empregados(){}

    public Empregados(String nome, Integer idade, Double salario, String cpf, String cargo, String endereco){
        this.nome = nome;
        this.idade= idade;
        this.salario=salario;
        this.cpf=cpf;
        this.cargo=cargo;
        this.endereco=endereco;
    }

    // Getters & Setters
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public Integer getIdade(){
        return idade;
    }
    public void setIdade(Integer idade){
        this.idade=idade;
    }

    public Double getSalario(){
        return salario;
    }
    public void setSalario(Double salario){
        this.salario=salario;
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf=cpf;
    }

    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo=cargo;
    }

    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String end){
        this.endereco=end;
    }

}
