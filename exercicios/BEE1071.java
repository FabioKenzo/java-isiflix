import java.util.Scanner;

public class BEE1071{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);

    int x, y, maior, menor, soma; 
    soma = 0;
    

    x = teclado.nextInt();
    y = teclado.nextInt(); 

    if(x < y){
        menor = x;
        maior = y;

    }else{
        menor = y; 
        maior = x;
    }

    for(int contador = menor + 1; contador < maior; contador++){
        if(contador % 2 != 0){
            soma += contador;
        }
    }

    System.out.println(soma);

    teclado.close();

    }
}