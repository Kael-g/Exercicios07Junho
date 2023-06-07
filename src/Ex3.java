import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex3 {

    //Entrada: Número de identificação de um aluno, suas 3 notas de avaliação e média da nota dos exercícios
    //Processamento: Média ponderada, p1 peso 1, p2 peso 2, p3 peso 3, exercicios peso 1.
    //               APROVADO:  A 90+, B 75+, C 60+    REPROVADO: D 40+, E
    //Saída: informações da entrada, média ponderada, menção, resultado.
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        int matricula, i;
        String mencao, resultado;
        double[] notas = new double[5];
        //notas[0-2] são as notas de avaliação, nota[3] a média dos exercícios e nota[4] a média final

        System.out.println("Vamos fazer o boletim de um aluno!");
        System.out.printf("Digite a matrícula do aluno: ");
        matricula = input.nextInt();
        for (i=0; i<3; i++) {
            System.out.printf("Digite a nota da %d avaliação: ", i + 1);
            for(notas[i] = input.nextDouble(); notas[i]<0 || notas[i]>100; notas[i] = input.nextDouble()){
                System.out.printf("Valor inválido. A nota deve ser um número entre 0 e 100: ");
            }
        }
        System.out.printf("Digite a média dos exercícios: ");
        notas[i++] = input.nextDouble();
        notas[i] = (notas[0] + notas[1]*2 + notas[2]*3 + notas[3])/7;

        if (notas[4] < 60){
            resultado = "Reprovado";
            if (notas[4] < 40){
                mencao = "E";
            } else {
                mencao = "D";
            }
        } else {
            resultado = "Aprovado";
            if (notas[4] < 75){
                mencao = "C";
            } else if (notas[4] < 90){
                mencao = "B";
            } else {
                mencao = "A";
            }
        }
        i=0;
        System.out.printf("%-20s%-14s%-14s%-14s%-14s%-14s%-14s%s\n","Aluno ID","Avaliação 1", "Avaliação 2", "Avaliação 3", "Exercícios", "Média final", "Menção", "Resultado");
        System.out.printf("%-20s%-14s%-14s%-14s%-14s%-14s%-14s%s",matricula,notas[i++], notas[i++],notas[i++],notas[i++],df.format(notas[i++]), mencao, resultado);
    }
}
