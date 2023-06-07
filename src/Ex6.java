import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex6 {
    //Entrada: Uma sequência de números de tamanho indefinido, até que seja digitado um número negativo
    //Saída: Soma dos números da sequência
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.#");
        double numero, soma = 0;
        int i = 0;
        System.out.println("Digite quantos números quiser, e vamos somar todos eles! Para parar, digite um número negativo.\n");
        System.out.printf("Digite o %dº número da sequência: ", ++i);
        for (numero = input.nextDouble(); numero >= 0; numero = input.nextDouble()){
            System.out.printf("Digite o %dº número da sequência: ", ++i);
            soma += numero;
        }

        System.out.printf("A soma dos números digitados é %s", df.format(soma));
    }
}
