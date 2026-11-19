package br.edu.ads.projetosapi.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjetoController {
    @GetMapping("/api/projetos/1")
    public Map<String, Object> consultarProjeto() {
        return Map.of(
            "id", 1,
            "nome", "portal de estagios",
            "responsavel", "Equipe ConectaTech",
            "status", "Em desenvolvimento"
        );
    }
}
