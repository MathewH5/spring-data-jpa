package br.com.alura.desafios.springDataJpa;

import java.util.*;
import java.util.stream.Collectors;

public class stream {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(10, 20, 30, 7, 40,10,50);

//        for(Integer integer : num){
//            System.out.println(integer);
//        }

//        lista.stream().forEach(elemento -> System.out.println(elemento));

//        lista.forEach(System.out::println);

//        lista.stream()
//                .skip(2)//operacao  intermediaria
//                .forEach(e -> System.out.print(e + " "));

//        lista.stream()
//                .limit(2)
//                .forEach(e -> System.out.print(e + " "));

//        lista.stream()
//                .distinct() //equals hashcode
//                .forEach(e -> System.out.print(e + " "));

//        lista.stream()
//                .filter(e -> e % 2 == 0)
//                .forEach(e -> System.out.print(e + " "));

//        lista.stream()
//                .map(e -> e*2)// lista original nao modificada
//                .forEach(e -> System.out.print(e + " "));

//        operacoes finais
//
//        forEach
//        Count
//        Min e Max
//        Collect toList
//        Collect groupingBy
//        Collect joining

//        Long count2 = lista.stream()
//                .filter(e -> e % 2 == 0)
//                .count();
//
//        System.out.println(count2);

//
//        Optional<Integer> min = lista.stream()
//                .filter(e -> e % 2 == 0)
//                .min(Comparator.naturalOrder());
//
//        System.out.println(min.get());


//        Optional<Integer> max = lista.stream()
//                .filter(e -> e % 2 == 0)
//                .max(Comparator.naturalOrder());
//
//        System.out.println(max.get());

//        List<Integer> novaLista = lista.stream()
//                .filter(e -> e % 2 == 0)
//                .map(e -> e * e)
//                .collect(Collectors.toList());
//
//        System.out.println(novaLista);

//        Map<Boolean, List<Integer>> mapa = lista.stream()
//                .map(e -> e * 3)
//                .collect(Collectors.groupingBy(e -> e % 2 == 0));// pois esse resultado e Boolean
//
//        System.out.println(mapa);
        // criou um mapa oque ee ture(par) virou uma lista de true e oque nao e  virou outra lista

//        Map<Integer, List<Integer>> collect = lista.stream()
//                .collect(Collectors.groupingBy(e -> e % 3));//resto da divisao por 3
//
//        System.out.println(collect);

        

    }
}
