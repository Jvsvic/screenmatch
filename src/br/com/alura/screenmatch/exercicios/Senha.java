package br.com.alura.screenmatch.exercicios;

import java.util.Scanner;

public class Senha {
    private static String senha = "123456";
    public static String getSenha() {
        return senha;
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner leituraSenha = new Scanner(System.in);

        System.out.println("Digite sua senha: ");

        try {
            String senhaDigitada = leituraSenha.nextLine();
            if (senhaDigitada.equals(getSenha())) {
                System.out.println("Acesso autorizado. ");
            } else{
                throw new SenhaInvalidaException("Senha inválida!");
            }
        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        }
        leituraSenha.close();
    }
}
