import java.util.Scanner;

public class Ex7 {
    //Entrada: Nome do usuário e um número N
    //Saída: Nome do usuário N vezes
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String nome = input.nextLine();
        System.out.println("Quantas vezes você quer que seu nome apareça?");
        int n = input.nextInt();
        System.out.println("Ok, lá vamos nós: ");
        for (int i = 0; i < n; i++){
            System.out.println((i+1) +". "+nome);
        }
    }
}
