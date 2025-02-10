package br.com.alura.desafios.springDataJpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//1 - Imagine que você tem uma lista de strings. Algumas das strings são números, mas outras não.
// Queremos converter a lista de strings para uma lista de números. Se a conversão falhar, você deve ignorar o valor.
// Por exemplo, na lista a seguir, a saída deve ser [10, 20]:

//Integer numero = 10;
//System.out.println(numero.toString()); // Converte para String e imprime: "10"
//System.out.println(Integer.parseInt("123")); // Converte uma String para int: 123


public class ex1 {

    public static void main(String[] args) {
        List<String> lista = Arrays.asList("10", "abdf", "23","KLK");
        List<Integer> listaNumeros = new ArrayList<>();

        for (String s : lista) {
            converterEmNumero(s).ifPresent(listaNumeros::add);
            if (converterEmNumero(s).isEmpty()){
                System.out.println(s+"nao podera ser transforamado em Numero");
            }
        }
        System.out.println(listaNumeros);

    }

    public static Optional<Integer> converterEmNumero(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
