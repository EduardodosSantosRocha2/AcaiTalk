package com.mycompany.Acaitalk.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@Slf4j
public class LerArquivoExcel {

    public List<Devedores> lerArquivo(final String nomeArquivo) throws FileNotFoundException, IOException {
        log.info("Lendo o arquivo {}", nomeArquivo);
        List<Devedores> devedores = new ArrayList<>();

        try (FileInputStream excelFile = new FileInputStream(nomeArquivo)) {
            var workbook = new XSSFWorkbook(excelFile);
            var primeiraAba = workbook.getSheetAt(0);     
            int contadorLinha = 0;
            
            for (Row linha : primeiraAba) {
                if(++contadorLinha == 1) continue;
                var devedor = Devedores.builder()
                        .CPF(linha.getCell(0).getStringCellValue())
                        .nome(linha.getCell(1).getStringCellValue())
                        .dataNascimento(linha.getCell(2).getStringCellValue())
                        .email(linha.getCell(3).getStringCellValue())
                        .telefone(linha.getCell(4).getStringCellValue())
                        .endereco(linha.getCell(5).getStringCellValue())
                        .build();
                devedores.add(devedor);
                 log.info("Lendo cliente {}", devedor);

            }

        }catch (FileNotFoundException e) {
            log.error("Arquivo não encontrado {}", nomeArquivo);
        } catch (IOException e) {
            log.error("Erro ao processar o arquivo {}", nomeArquivo);
        }
        log.info("Total de clientes lidos {}", devedores.size());
        return devedores;
    }   
}
