import java.util.Scanner;

public class BEE1067{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);
    
    int num, impares;
    
    num = teclado.nextInt();
    
    for(int contador = 0; contador <= num; contador++){
        
        if(contador % 2 != 0){
            System.out.println(contador);
        }
    }

    teclado.close();

    }
}