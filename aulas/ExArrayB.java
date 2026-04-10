/*
Crie um array de String com 5 posições e peça para o usuário digitar 5 itens de uma lista de compras.
Após ler todos os itens, o programa deve mostrar a lista na ordem inversa (do último para o primeiro).
Dica: Para fazer o inverso, o seu for deve começar no índice 4, continuar enquanto o índice for >= 0, e ir diminuindo (i--).
*/

import java.util.Scanner;

public class ExArrayB{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        String[] compras = new String[5];

        for(int i = 0; i < 5; i++){
            compras[i] = teclado.nextLine();
        }

        for(int i = 4; i >= 0; i--){
           System.out.println(compras[i]); 
        }

    
        teclado.close();

    }
}