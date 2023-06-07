import java.util.Scanner;

public class Ex1 {
    //Entrada: 2 inteiros A e B
    //Saída: C, onde C é A+B se A = B ou A*B caso contrário
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B, C;
        System.out.println("Vamos calcular o resultado de uma operação entre 2 números!\nSoma se forem iguais, multiplicação se forem diferentes.\n");
        System.out.print("Digite o primeiro número: ");
        A = input.nextInt();
        System.out.print("Digite o segundo número: ");
        B = input.nextInt();

        if (A == B){
            C = A + B;
        } else {
            C = A*B;
        }

        System.out.printf("\nResultado: %d",C);

    }
}
