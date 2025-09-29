package com.felipeMovio.joken.controller;

import com.felipeMovio.joken.dto.JogadaRequest;
import com.felipeMovio.joken.dto.ResultadoResponse;
import com.felipeMovio.joken.model.Game;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jokenpo")
public class GameController {

    private Game jogo = new Game();

    @PostMapping("/jogar")
    public ResultadoResponse jogar(@RequestBody JogadaRequest Request) {
        if (jogo.isFinalizado()){
            return new ResultadoResponse(
                    "o jogo ja terminol",
                    null,
                    jogo.getVitoriasJogador(),
                    jogo.getVitoriasComputador(),
                    true,
                    jogo.resultado()
            );
        }
        jogo.setJogadaJogador(Request.getJogada());
        jogo.jogadaComputador();
        String resultadoRodada = jogo.resultado();

        return new ResultadoResponse(
                resultadoRodada,
                jogo.getComputador().getJogada(),
                jogo.getVitoriasJogador(),
                jogo.getVitoriasComputador(),
                jogo.isFinalizado(),
                jogo.isFinalizado() ? resultadoRodada : null
        );
    }
}
