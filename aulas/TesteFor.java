import java.util.Scanner;

public class TesteFor{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);

    int num, resultado; 
    
    System.out.println("Digite um valor: ");
    num = teclado.nextInt(); 

    //contador = contador + 1
    //contador ++
    //contador += 1

    for( int contador = 1; contador <= 10; contador ++){
        if(contador == 5){
            continue;
        }
        resultado = num * contador;
        System.out.println(num + " x " + contador + " = " + resultado);
    }

    teclado.close();


    }
}