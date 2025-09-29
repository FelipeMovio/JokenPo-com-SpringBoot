package com.felipeMovio.joken.model;

import lombok.*;

import java.util.Random;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Game {

    private Player jogador = new Player("Jogador");
    private Player computador = new Player("Computador");
    private Integer vitoriasJogador = 0;
    private Integer vitoriasComputador = 0;
    private boolean isFinalizado = false;

    public void setJogadaJogador(Jogada jogada){
        jogador.escolherJogada(jogada);
    }

    public void jogadaComputador(){
        Jogada[] valores = Jogada.values();
        Jogada jogadaRandom = valores[new Random().nextInt(valores.length)];
        computador.escolherJogada(jogadaRandom);
    }

    public String resultado(){
        Jogada jogadaUsuario = jogador.getJogada();
        Jogada jogadaPc = computador.getJogada();

        if (jogadaUsuario == jogadaPc){
            return "Empate";
        }else if (jogadaUsuario.venceDe(jogadaPc)){
            isFinalizado = true;
            vitoriasJogador++;
            return jogador.getNome() + "vemceu!";
        } else {
            isFinalizado = true;
            vitoriasComputador++;
            return computador.getNome() + "vemceu!";
        }
    }
}
