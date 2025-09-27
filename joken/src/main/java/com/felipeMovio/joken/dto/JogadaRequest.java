package com.felipeMovio.joken.dto;

import com.felipeMovio.joken.model.Jogada;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class JogadaRequest {
    private Jogada jogada;
}
