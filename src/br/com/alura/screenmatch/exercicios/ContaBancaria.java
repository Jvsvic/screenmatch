package br.com.alura.screenmatch.exercicios;
public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void exibeFichaConta(){
        System.out.println("Nome do titular: " + titular + "\nSaldo: " + getSaldo() + "\nNúmero da conta: " + getNumeroConta());
    }
}
