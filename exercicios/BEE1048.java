import java.util.Scanner;

public class BEE1048{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);

    int percentual;
    double salarioAtual, novoSalario, reajuste; 
    percentual = 0; 
    salarioAtual = 0;
    novoSalario = 0; 
    reajuste = 0;

    salarioAtual = teclado.nextDouble(); 

    if(salarioAtual <= 400.00){
        percentual = 15;
        reajuste = salarioAtual * 0.15;
        novoSalario = salarioAtual + reajuste; 
    }
    else if(salarioAtual > 400.00 && salarioAtual <= 800.00){
        percentual = 12;
        reajuste = salarioAtual * 0.12;
        novoSalario = salarioAtual + reajuste;
    }
    else if(salarioAtual > 800.00 && salarioAtual <= 1200.00){
        percentual = 10;
        reajuste = salarioAtual * 0.10; 
        novoSalario = salarioAtual + reajuste;
    }
    else if(salarioAtual > 1200.00 && salarioAtual <= 2000.00){
        percentual = 7;
        reajuste = salarioAtual * 0.07; 
        novoSalario = salarioAtual + reajuste;
    }
    else if(salarioAtual > 2000.00){
        percentual = 4;
        reajuste = salarioAtual * 0.04;
        novoSalario = salarioAtual + reajuste;
    }

    System.out.printf("Novo salario: %.2f\n", novoSalario);
    System.out.printf("Reajuste ganho: %.2f\n", reajuste);
    System.out.printf("Em percentual: %d %%%n", percentual);

    teclado.close();

    }
}