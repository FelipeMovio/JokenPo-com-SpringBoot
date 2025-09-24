package com.felipeMovio.joken.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
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
