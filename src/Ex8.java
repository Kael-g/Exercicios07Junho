import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex8 {
    //Entrada: Conjunto de salários (até que se digite -1) e valor do reajuste
    //Saída: Salários reajustados
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");
        List<Double> salario_incial = new ArrayList<>();
        List<Double> salario_final = new ArrayList<>();
        double reajuste, salario;
        int i =0;

        System.out.println("Digite todos os valores dos salários que receberão um reajuste. Para interromper, digite -1");

        do {
            System.out.printf("Digite %dº salário: ", ++i);
            salario = input.nextDouble();
            if (salario >= 0){
                salario_incial.add(salario);
            } else if (salario < -1){
                System.out.println("Valor inválido");
                i--;
            } else {
                break;
            }
        } while (i>0);

        System.out.print("Digite o valor do reajuste (somente números, exemplo: 5 para 5%): ");
        reajuste = input.nextDouble();

        System.out.printf("\n%-20s%-20s\n","Salário Inicial", "Salário Atualizado ("+reajuste+" %)");

        reajuste = (reajuste + 100)/100;

        for (i = 0; i < salario_incial.size(); i++){
            salario_final.add(salario_incial.get(i)*reajuste);
            System.out.printf("%-20s%-20s\n","R$ " + df.format(salario_incial.get(i)), "R$ " + df.format(salario_final.get(i)));
        }
    }
}
