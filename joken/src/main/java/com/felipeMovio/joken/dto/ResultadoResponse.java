package com.felipeMovio.joken.dto;

import com.felipeMovio.joken.model.Jogada;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class ResultadoResponse {
    private String resultadoRodada;

    private Jogada jogadaComputador;

    private Integer vitoriasJogador;
    private Integer vitoriasComputador;

    private boolean isFinalizado;

    private String resultadoFinal;
}
