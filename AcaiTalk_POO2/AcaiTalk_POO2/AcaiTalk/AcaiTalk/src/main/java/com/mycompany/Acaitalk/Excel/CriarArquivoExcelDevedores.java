package com.mycompany.Acaitalk.Excel;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;



@Slf4j // ----->>>> registrar informações, erros e debug
public class CriarArquivoExcelDevedores {
    
    public void criarArquivo(final String nomeArquivo, final List<Devedores> listaDevedores) {
        log.info("Gerando o arquivo {}", nomeArquivo);

        try (var workbook = new XSSFWorkbook();
             var outputStream = new FileOutputStream(nomeArquivo)) {
            var planilha = workbook.createSheet("Lista de Devedores");
            int numeroDaLinha = 0;

            adicionarCabecalho(planilha, numeroDaLinha++);

            for (Devedores devedores : listaDevedores) {
                var linha = planilha.createRow(numeroDaLinha++);
                adicionarCelula(linha, 0, devedores.getCPF());
                adicionarCelula(linha, 1, devedores.getNome());
                adicionarCelula(linha, 2, devedores.getDataNascimento());
                adicionarCelula(linha, 3, devedores.getEmail());
                adicionarCelula(linha, 4, devedores.getTelefone());
                adicionarCelula(linha, 5, devedores.getEndereco());
                adicionarCelula(linha, 6, devedores.getValorDivida());
            }

            workbook.write(outputStream);
        } catch (FileNotFoundException e) {
            log.error("Arquivo não encontrado: {}", nomeArquivo);
        } catch (IOException e) {
            log.error("Erro ao processar o arquivo: {} ", nomeArquivo);
        }
        log.info("Arquivo gerado com sucesso!");
    }

    private void adicionarCabecalho(XSSFSheet planilha, int numeroLinha) {
        var linha = planilha.createRow(numeroLinha);
        adicionarCelula(linha, 0, "CPF");
        adicionarCelula(linha, 1, "Nome");
        adicionarCelula(linha, 2, "Data Nascimento");
        adicionarCelula(linha, 3, "Email");
        adicionarCelula(linha, 4, "Telefone");
        adicionarCelula(linha, 5, "Endereco");
        adicionarCelula(linha, 6, "Valor Divida");   
    }

    private void adicionarCelula(Row linha, int coluna, String valor) {
        Cell cell = linha.createCell(coluna);
        cell.setCellValue(valor);
    }

    private void adicionarCelula(Row linha, int coluna, int valor) {
        Cell cell = linha.createCell(coluna);
        cell.setCellValue(valor);
    }
}