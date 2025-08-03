import calculadora.IMultiplicacao;
import calculadora.ISoma;

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

        Double mult = multiplicacao.multiplicacao(44d,11d);

        System.out.println("Multiplicação: " + mult);
    }
}