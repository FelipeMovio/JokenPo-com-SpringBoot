package com.felipeMovio.joken.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    private String nome;
    private Jogada jogada;

    public Player(final String nome){
        this.nome =nome;
    }

    public void escolherJogada(final Jogada jogada){
        this.jogada = jogada;

    }
}
