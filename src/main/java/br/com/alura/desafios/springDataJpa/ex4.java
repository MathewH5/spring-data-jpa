package br.com.alura.desafios.springDataJpa;

//4 - Implemente um método que verifica se uma frase é um palíndromo.
// Um palíndromo é uma palavra/frase que, quando lida de trás pra frente, é igual à leitura normal. Um exemplo:


public class ex4 {
    public static void main(String[] args) {
        System.out.println(ehPalindromo("Socorram-me, subi no onibus em marrocos")); // Saída: true
        System.out.println(ehPalindromo("Java")); // Saída: false


    }

    public static boolean ehPalindromo (String frase){
        String limpa = frase.replaceAll("[, -]","").toUpperCase();
        System.out.println(limpa);

        for (int i=0; i < limpa.length(); i++){

            int comparacao = limpa.length()-1-i;

            if(limpa.charAt(i)==limpa.charAt(comparacao)){
                System.out.println(limpa.charAt(i) + " comparado com " +limpa.charAt(comparacao));
            }
            else{
                System.out.println(limpa.charAt(i) + " comparado com " +limpa.charAt(comparacao));
                return false;
            }
        }
        return true;
    }
}
