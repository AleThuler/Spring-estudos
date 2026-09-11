package com.github.alethuler.api_de_cadastro.Funcionarios.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class FuncionarioController {

    @GetMapping("/java")
    public String falarJava(){
        return "Java!";
    }
}
