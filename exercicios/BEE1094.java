import java.util.Scanner;

public class BEE1094{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in); 

    int totalCobaias, c, r, s, totalTipos; 
    double percentual, percentualCoelhos, percentualRatos, percentualSapos;
    c = 0; 
    r = 0; 
    s = 0; 
    totalCobaias = 0;
    totalTipos = 0;

    int n = teclado.nextInt(); 

    for(int contador = 0; contador < n; contador++){
        int valores = teclado.nextInt();
        String tipos = teclado.next();

        if(tipos.equals("C")){
            c += valores;
            totalCobaias += valores;
        }
        else if(tipos.equals("R")){
            r += valores;
            totalCobaias += valores;
        }
        else if(tipos.equals("S")){
            s += valores;
            totalCobaias += valores;
        }

    }

    
    percentualCoelhos = (c * 100.0) / totalCobaias;
    percentualRatos = (r * 100.0) / totalCobaias; 
    percentualSapos = (s * 100.0) / totalCobaias;


    System.out.println("Total: " + totalCobaias + " cobaias");
    System.out.println("Total de coelhos: " + c); 
    System.out.println("Total de ratos: " + r); 
    System.out.println("Total de sapos: " + s); 
    System.out.printf("Percentual de coelhos: %.2f %%\n", percentualCoelhos); 
    System.out.printf("Percentual de ratos: %.2f %%\n", percentualRatos); 
    System.out.printf("Percentual de sapos: %.2f %%\n", percentualSapos);

    teclado.close();
    }
}