public class Ex9 {
    //Entrada: Não tem
    //Processamento: armazenar os números de 101 a 150 em um vetor de tamanho 50
    //Saída: exibir o vetor
    public static void main(String[] args) {
        int[] vetor = new int[50];
        for (int i = 0; i < 50; i++){
            vetor[i] = i+101;
        }
        System.out.println("Vetor 101 - 150:");
        for (int n : vetor){
            System.out.printf("%d\n",n);
        }
    }
}
