package br.com.alura.screenmatch.exercicios;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Arquivo
 */
public class Arquivo  {
    public static void main(String[] args) throws IOException, InterruptedException {
        String txt = "Salvando arquivo";
        FileWriter arquivo = new FileWriter("arquivo.txt");
        arquivo.write(txt.toString());
        arquivo.close();
    }
}
