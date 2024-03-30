package com.mycompany.Acaitalk.Excel;

import java.util.List;

public class PrintArquivoExcel {
    public void printArquivo(List<Devedores> devedoresRead ){
        for (Devedores devedor : devedoresRead) {
            System.out.println("CPF do devedor: " + devedor.getCPF());
            System.out.println("Nome do devedor: " + devedor.getNome());
            System.out.println("Data de nascimento do devedor: " + devedor.getDataNascimento());
            System.out.println("Email do devedor: " + devedor.getEmail());
            System.out.println("Telefone do devedor: " + devedor.getTelefone());
            System.out.println("Endereço do devedor: " + devedor.getEndereco());
        }
    } 
}
