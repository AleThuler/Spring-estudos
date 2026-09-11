package com.github.alethuler.api_de_cadastro.Funcionarios.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import com.github.alethuler.api_de_cadastro.Trabalhos.TrabalhosModel;

@Entity
@Table(name = "tb_cadastro_de_funcionarios")
public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private String cargo;

    private double salario;

    @ManyToOne
    @JoinColumn(name = "id_trabalhos")
    private TrabalhosModel trabalhos;

    public FuncionarioModel(){

    }

    public FuncionarioModel(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
