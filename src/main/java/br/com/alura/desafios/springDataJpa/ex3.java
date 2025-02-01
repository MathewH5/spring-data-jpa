package br.com.alura.desafios.springDataJpa;

//3 - Implemente um método que recebe uma String representando um nome completo separado por espaços.
// O método deve retornar o primeiro e o último nome após remover os espaços desnecessários.

public class ex3 {

    public static void main(String[] args) {
        System.out.println(obterPrimeiroEUltimoNome("  João Carlo  s   Silva   ")); // Saída: "João Silva"
        System.out.println(obterPrimeiroEUltimoNome("Maria   ")); // Saída: "Maria"


    }

    public static String obterPrimeiroEUltimoNome(String nomeCompleto){
        String[] nomes = nomeCompleto.trim().split("\\s+");
        String nomeENomeFinal = "";
        if (nomes.length>1){
            nomeENomeFinal = nomes[0] +" "+ nomes[nomes.length-1];
        }else {
            nomeENomeFinal = nomes[0];
        }
        return nomeENomeFinal;
    }
}
