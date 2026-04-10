import java.util.Scanner;

public class BEE1008{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int funcionario, horasTrabalhada;
        double valorHora, calculoSalario;

        funcionario = teclado.nextInt(); 
        horasTrabalhada = teclado.nextInt();
        valorHora = teclado.nextDouble();

        calculoSalario = horasTrabalhada * valorHora;
        System.out.println("NUMBER = " + funcionario);
        System.out.printf("SALARY = U$ %.2f\n", calculoSalario);

        teclado.close();

    }
}