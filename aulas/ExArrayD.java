/*
Crie um array com 5 nomes de cidades. Depois, peça para o usuário digitar o nome de uma cidade. 
O programa deve percorrer o array e dizer se a cidade digitada está ou não na lista de viagens programadas.
Dica: Use o comando .equals() para comparar as Strings (ex: cidades[i].equals(nomeDigitado)).
*/

import java.util.Scanner; 

public class ExArrayD{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in); 

        String[] cidades = new String[]{"Taubaté", "Caçapava", "Tremembé", "Ubatuba", "Caraguatatuba"};

        boolean encontrou = false; 
        String cidadeDigitada = "";

        while(!encontrou){
            System.out.println("Digite o nome de uma cidade: "); 
            cidadeDigitada = teclado.nextLine(); 
        

            for(int i = 0; i < cidades.length; i++){
                if(cidades[i].equals(cidadeDigitada)){
                encontrou = true;
                break;
                }
            }
        }

        if(encontrou){
            System.out.println(cidadeDigitada + " está na lista");
        }
        else{
            System.out.println(cidadeDigitada + " não está na lista");
        }

        teclado.close();

    }
}