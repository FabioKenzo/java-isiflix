import java.util.Scanner;

public class BEE1070{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);

    int inicio; 
    
    inicio = teclado.nextInt(); 

    if(inicio % 2 == 0){
        inicio ++;
    }

    for(int contador = 0; contador < 6 ; contador++){
        System.out.println(inicio); 
        inicio += 2; 
    }

    teclado.close();
    }
}