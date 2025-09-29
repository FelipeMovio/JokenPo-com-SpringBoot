package com.felipeMovio.joken.dto;

import com.felipeMovio.joken.model.Jogada;
import lombok.*;

@Getter
@Setter
public class ResultadoResponse {
    private String resultadoRodada;

    private Jogada jogadaComputador;

    private Integer vitoriasJogador;
    private Integer vitoriasComputador;

    private boolean isFinalizado;

    private String resultadoFinal;


    public ResultadoResponse(String resultadoRodada, Jogada jogadaComputador, Integer vitoriasJogador, Integer vitoriasComputador, boolean isFinalizado, String resultadoFinal) {
        this.resultadoRodada = resultadoRodada;
        this.jogadaComputador = jogadaComputador;
        this.vitoriasJogador = vitoriasJogador;
        this.vitoriasComputador = vitoriasComputador;
        this.isFinalizado = isFinalizado;
        this.resultadoFinal = resultadoFinal;
    }
}
