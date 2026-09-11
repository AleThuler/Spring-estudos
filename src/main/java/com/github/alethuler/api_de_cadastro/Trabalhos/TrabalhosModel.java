package com.github.alethuler.api_de_cadastro.Trabalhos;

import com.github.alethuler.api_de_cadastro.Funcionarios.Model.FuncionarioModel;
import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "tb_trabalhos")
public class TrabalhosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String tituloDoTrabalho;

    private int quantidadeDePessoas;

    @OneToMany(mappedBy = "trabalhos")
    private ArrayList<FuncionarioModel> funcionarios;

}
