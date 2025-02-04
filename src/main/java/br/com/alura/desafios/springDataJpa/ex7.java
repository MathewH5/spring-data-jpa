package br.com.alura.desafios.springDataJpa;

public class ex7 {
    public static void main(String[] args) {
        double valorEmReais = 100.0;

        System.out.println("Valor em Reais: " + valorEmReais);
        System.out.println("Valor em Dólar: " + ex7Moeda.DOLAR.converterPara(valorEmReais));
        System.out.println("Valor em Euro: " + ex7Moeda.EURO.converterPara(valorEmReais));
        System.out.println("Valor em Real: " + ex7Moeda.REAL.converterPara(valorEmReais));
    }
}
