import java.util.Scanner;
public class Exercicio10{
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        double fabrica, distribuidor, impostos, custoFinal;
        System.out.println("Digite o primeiro valor");
        fabrica = leitor.nextDouble();
        distribuidor = 0.28 * fabrica;
        impostos = 0.45 * fabrica;
        custoFinal = fabrica + distribuidor + impostos;
        System.out.printf("%.2f + %.2f + %.2f = %.2f\n", fabrica, distribuidor, impostos, custoFinal);
    }
}