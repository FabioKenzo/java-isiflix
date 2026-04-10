import java.util.Scanner;

public class BEE1051{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);

    double salario, imposto, sobra; 
    imposto = 0;

    salario = teclado.nextDouble(); 

    if(salario <= 2000.00){
        System.out.println("Isento");
    }
    else if(salario > 2000.00 && salario <= 3000.00){
        sobra = salario - 2000;
        imposto = sobra * 0.08; 
        System.out.printf("R$ %.2f\n", imposto);

    }
    else if(salario > 3000.00 && salario <= 4500.00){
        imposto = 80 + (salario - 3000) * 0.18;
        System.out.printf("R$ %.2f\n", imposto);

    }
    else if(salario > 4500.00){
        imposto = 80 + 270 + (salario - 4500) * 0.28; 
        System.out.printf("R$ %.2f\n", imposto);
    }

    teclado.close();

    }
}