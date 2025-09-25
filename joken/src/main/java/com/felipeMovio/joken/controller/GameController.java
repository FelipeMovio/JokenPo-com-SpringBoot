package com.felipeMovio.joken.controller;

import com.felipeMovio.joken.dto.JogadaRequest;
import com.felipeMovio.joken.dto.ResultadoResponse;
import com.felipeMovio.joken.model.Game;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/api/jokenpo")
public class GameController {

    private Game jogo;

    @PostMapping("/jogar")
    public ResultadoResponse jogar(@RequestBody JogadaRequest Request){

    }
}
