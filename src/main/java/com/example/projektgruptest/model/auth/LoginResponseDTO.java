package com.example.projektgruptest.model.auth;

import com.example.projektgruptest.modelDTO.PracownikDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LoginResponseDTO {
    private String rola;
    private String token;
    private PracownikDTO pracownik;
    private boolean czyMaPodwladnych;
}
