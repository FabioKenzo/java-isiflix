import java.util.Scanner;

public class TesteIF{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);
    
    double nota1, nota2, media; 

    System.out.println("Digite a nota 1: ");
    nota1 = teclado.nextDouble(); 
    System.out.println("Digite a nota 2: "); 
    nota2 = teclado.nextDouble(); 

    media = (nota1 + nota2) / 2; 
    System.out.println("Sua média vale " + media);

    if (nota1 >=5.0 && media >= 6.0){
        System.out.println("Parabéns! Aprovado!!!");
    }
    else{
        System.out.println("Você está reprovado!");
    }
    
    teclado.close();

    }
}