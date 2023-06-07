import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex5 {
    //Entrada: 20 numeros
    //Saída: numeros entre 0 e 100
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.#");
        List<Double> numeros_0a100 = new ArrayList<>();
        double numero;

        System.out.println("Digite 20 números e te direi quais estão entre 0 e 100");

        for (int i = 0; i < 20; i++) {
            System.out.printf("Digite o %dº número: ",i+1);
            if ((numero = input.nextDouble()) > 0 && numero < 100) {
                numeros_0a100.add(numero);
            }
        }

        System.out.println("Números digitados entre 0 e 100:");
        for (double n : numeros_0a100){
            System.out.printf("%s ", df.format(n));
        }
    }
}
