import java.util.Scanner;

public class BEE1099{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt(); 
        int maior, menor;
        

        for(int contador = 0; contador < n; contador++){
            int x = teclado.nextInt(); 
            int y = teclado.nextInt();
            int soma = 0; 

            if(x < y){
                maior = y; 
                menor = x;
            }
            else{
                maior = x; 
                menor = y;
            }
            
        for(int i = menor + 1; i < maior; i++){
            if(i % 2 != 0){
                soma += i;
            }
        }

        System.out.println(soma);
        }

        teclado.close();

    }
}