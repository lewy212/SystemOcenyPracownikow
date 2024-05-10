package com.example.projektgruptest.modelDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PracownikDTO {
    @NotEmpty
    private Long id;
    private String imie;
    private String nazwisko;
    private String stopienNaukowy;
    private String stanowisko;
    private String katedra;
    private Boolean czyMoznaOcenic;
    @NotBlank
    private String grupa;
}
