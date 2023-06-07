public class Ex2 {
    //Entrada: N inteiro
    //Saída: N+5 se N for par, N+8 se ímpar
    public static void main(String[] args) {
        System.out.println("Digite um número! Vou somar 5 a ele se for par, 8 se for ímpar!");
        int numero = new java.util.Scanner(System.in).nextInt();
        System.out.printf("Resultado: ");
        if (numero % 2 == 0){
            System.out.print(numero+5);
        } else {
            System.out.print(numero+8);
        }
    }
}
