import java.util.Scanner;
public class AtividadeAvaliativa1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] notas = new double[8];
        System.out.println("===Sistema Escolar===");
        System.out.println("Digite as 8 notas do aluno:");
        for (int i = 0; i<8; i++) {
            System.out.print("Nota" + (i + 1) + ":");
            notas[i] = input.nextDouble();
        }
        double media1Bimestre = (notas[0] + notas[1])/2;
        double media2Bimestre = (notas[2] + notas[3])/2;
        double media3Bimestre = (notas[4] + notas[5])/2;
        double media4Bimestre = (notas[6] + notas[7])/2;
        double media1Semestre = (media1Bimestre + media2Bimestre)/2;
        double media2Semestre = (media3Bimestre + media4Bimestre)/2;
        double mediaFinal = (media1Semestre + media2Semestre)/2;
        System.out.println("\n===RESULTADOS===");
        System.out.println("Práticas");
        System.out.printf("1ºBimestre:%.1f%n",media1Bimestre);
        System.out.printf("2ºBimestre:%.1f%n",media2Bimestre);
        System.out.printf("1ºSemestre:%.1f%n",media1Semestre);
        System.out.println("------------");
        System.out.printf("3ºBimestre:%.1f%n",media3Bimestre);
        System.out.printf("4ºBimestre:%.1f%n",media4Bimestre);
        System.out.printf("2ºSemestre:%.1f%n",media2Semestre);
        System.out.println("--------");
        System.out.printf("Média Final:%.1f%n",mediaFinal);
        input.close();


    }

}