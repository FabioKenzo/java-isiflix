import java.util.Scanner;

public class BEE1049{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);

    String word1, word2, word3; 

    word1 = teclado.nextLine();
    word2 = teclado.nextLine();
    word3 = teclado.nextLine();

    if (word1.equals("vertebrado")) {
            
            // 2º Nível: Ave ou Mamifero
            if (word2.equals("ave")) {
                
                // 3º Nível: Carnivoro ou Onivoro
                if (word3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }

            } else if (word2.equals("mamifero")) {
                
                // 3º Nível: Onivoro ou Herbivoro
                if (word3.equals("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }

        } else { // Aqui o Java já sabe que word1 é "invertebrado"
            
            // 2º Nível: Inseto ou Anelideo
            if (word2.equals("inseto")) {
                
                // 3º Nível: Hematofago ou Herbivoro
                if (word3.equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }

            } else if (word2.equals("anelideo")) {
                
                // 3º Nível: Hematofago ou Onivoro
                if (word3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }
    
    teclado.close();

    }
}