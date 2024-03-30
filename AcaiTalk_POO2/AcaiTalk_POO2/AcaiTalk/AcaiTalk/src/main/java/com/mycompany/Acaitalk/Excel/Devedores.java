package com.mycompany.Acaitalk.Excel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Devedores {
    private String CPF;
    private String nome;
    private String dataNascimento;
    private String email;
    private String telefone;
    private String endereco; 
}
