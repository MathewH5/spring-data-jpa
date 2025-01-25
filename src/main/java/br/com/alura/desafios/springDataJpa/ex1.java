package br.com.alura.desafios.springDataJpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.*;


public class ex1 {

    public static void main(String[] args) {
//1 - Imagine que você tem uma lista de strings. Algumas das strings são números, mas outras não.
// Queremos converter a lista de strings para uma lista de números. Se a conversão falhar, você deve ignorar o valor.
// Por exemplo, na lista a seguir, a saída deve ser [10, 20]:

//Integer numero = 10;
//System.out.println(numero.toString()); // Converte para String e imprime: "10"
//System.out.println(Integer.parseInt("123")); // Converte uma String para int: 123

        List<String> input = Arrays.asList("10", "abc", "20", "30x");
        List<Integer> listaNumeros= new ArrayList<>();

        for (String item : input) {
            try {
                listaNumeros.add(Integer.parseInt(item));
            }catch (NumberFormatException e){
                System.out.println(item);
            }
        }
        System.out.println(listaNumeros);

    }
}
