import java.util.Scanner;

public class TesteWhile{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);

    int num, resultado, contador;

    System.out.println("Digite um valor: ");
    num = teclado.nextInt();
    contador = 1; 
    while(contador <=10){
        resultado = num * contador; 
        System.out.println(num + " x " + contador + " = " + resultado);
        contador += 1;
    }

    teclado.close();

    }
}