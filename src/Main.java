import calculadora.IMultiplicacao;
import calculadora.ISoma;
import generic.GenericResult;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Expressões Lambdas");

        ISoma calculadora = (a, b) -> {
            return a+b;
        };
        Integer soma = calculadora.soma(55,20185);

        System.out.println("Soma: " +soma);

        IMultiplicacao multiplicacao = (a, b) -> {
            return a*b;
        };

        System.out.println(" ");

        Double mult = multiplicacao.multiplicacao(44d,11d);

        System.out.println("Multiplicação: " + mult);

        System.out.println(" ");

        List<Integer> list = new LinkedList<>();


        GenericResult<Integer> multplicacao = (List<Integer> values) -> {
            for(Integer value : values) {
                System.out.println("GenericResult: " + value * 10);
            }
        };
        multplicacao.getValue(List.of(1,2,3,4,5,6,7));

        System.out.println(" ");

        GenericResult<Integer> numerosPares = (List<Integer> values) -> {
            for(Integer value : values) {
                if(value % 2 == 0) {
                    System.out.println("Numeros pares: " + value);
                }
            }
        };

        numerosPares.getValue(List.of(1,2,3,4,5,6,7));

        System.out.println(" ");

        GenericResult<String> upperCaseString = (List<String> values) -> {
            for(String value : values) {
                System.out.println("String Uppercase " + value.toUpperCase());
            }
        };

        upperCaseString.getValue(List.of("hello", "darkness,", "my", "old", "friend"));
    }
}