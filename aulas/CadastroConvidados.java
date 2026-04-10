import java.util.Scanner;

public class CadastroConvidados{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de convidados: "); 
        int quantConvidados = teclado.nextInt(); 
        teclado.nextLine();

        String [] convidados = new String [quantConvidados];

        for(int i = 0; i < convidados.length; i++){
            System.out.println("Digite o nome do convidado" + (i + 1) + ": "); 
            convidados[i] = teclado.nextLine();
        }

        for(int i = 0; i < convidados.length; i++){
            System.out.println("Posição [" + i + "]" + convidados[i]);
        }

        teclado.close(); 


    }
}