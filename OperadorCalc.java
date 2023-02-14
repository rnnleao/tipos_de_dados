import java.util.Scanner;

public class OperadorCalc {
    public static void main(String[] renan){
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        int soma;
        int sub;
        int mult;
        double div;
        double res;


        System.out.println("Digite um número");
        numero1=entrada.nextInt();

        System.out.println("Digite um número");
        numero2=entrada.nextInt();

        soma=numero1+numero2;
        System.out.println("A soma dos dois números são " +soma);

        sub=numero1-numero2;
        System.out.println("A subtração dos dois números são " +sub);

        mult=numero1*numero2;
        System.out.println("A multiplicação dos dois números são " +mult);

        div=numero1/numero2;
        System.out.println("A divisão dos dois números são " +div);

        res=numero1%numero2;
        System.out.println("O resto dos dois números são " +res);
    }
}