import java.util.Scanner;

public class BEE1133{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);

        int x = teclado.nextInt(); 
        int y = teclado.nextInt(); 
        int maior = 0; 
        int menor = 0; 

        if(x < y){
            maior = y; 
            menor = x;
        }
        else{
            maior = x; 
            menor = y;
        }

        for(int i = menor + 1; i < maior; i++){
            if(i % 5 == 2 || i % 5 == 3){
                System.out.println(i);
            }
            
        }
        teclado.close();
    }
}