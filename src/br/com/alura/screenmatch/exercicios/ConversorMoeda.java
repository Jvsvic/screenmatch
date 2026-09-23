package br.com.alura.screenmatch.exercicios;
public class ConversorMoeda implements ConversaoFinanceira {
    double dolar = 0;
    @Override
    public double converterDolarParaReal(double dolar) {
        return dolar * 5.74;
    }
}
