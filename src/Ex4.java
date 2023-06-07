import java.util.Scanner;

public class Ex4 {
    //Entrada: 20 idades
    //Saída: média das idades
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade, soma = 0;
        double media = 0;

        System.out.println("Vamos calcular a média de idade de um grupo de 20 pessoas!");

        for (int i = 0; i < 20; i++){
            System.out.printf("Digite a idade da %dª pessoa: ",i+1);
            for (idade = input.nextInt(); idade < 0 || idade > 130; idade = input.nextInt()){
                System.out.print("Idade inválida. Digite um valor válido: ");
            }
            soma += idade;
        }

        media = (double) soma / 20;

        System.out.printf("Média de idade: %.1f anos", media);

    }
}
