package br.com.alura.desafios.springDataJpa;

import br.com.alura.exception.NumeroInvalidoException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1 - Imagine que você tem uma lista de strings. Algumas das strings são números, mas outras não.
// Queremos converter a lista de strings para uma lista de números. Se a conversão falhar, você deve ignorar o valor.
// Por exemplo, na lista a seguir, a saída deve ser [10, 20]:

//Integer numero = 10;
//System.out.println(numero.toString()); // Converte para String e imprime: "10"
//System.out.println(Integer.parseInt("123")); // Converte uma String para int: 123



public class ex1 {

    public static void main(String[] args){

        List<String> listaDeString = Arrays.asList("10", "BFC", "B10", "2");
        List<Integer> listaSoComOsNumeros = new ArrayList<>();
        listaSoComOsNumeros.add(0);

        for (String item : listaDeString){
            try{
                listaSoComOsNumeros.add(Integer.parseInt(item));
            }catch (NumberFormatException e){
                System.out.println("Ignorando item inválido: " + item);
            }
        }

        System.out.println(listaSoComOsNumeros);
    }
}
