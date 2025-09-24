package com.felipeMovio.joken.entity;

public enum Jogada {
    PEDRA, PAPEL, TESOURA;

    public void venceDe(jogada outra){
        return(this == PEDRA && outra == TESOURA) ||
                (this == PAPEL && outra == PEDRA) ||
                (this == TESOURA && outra == PAPEL):
    }
}
