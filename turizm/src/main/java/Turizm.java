import java.io.IOException;
import java.util.Scanner;
public class Turizm {
    public static void main(String args[]) throws IOException{
    Scanner giris = new Scanner(System.in);
    int i;
    
    System.out.println("HO Turizm A.S. Sunar");
    System.out.println("(1)Orta Avrupa Turu");
    System.out.println("(2)Amerika Turu");
    System.out.println("(3)Uzak Doğu Turu");
    System.out.println("Seciminiz?");
    i=giris.nextInt();
    switch(i){
        case 1:
            System.out.println("Ucak ile Viyana, Budapeste, Prag");
            break;
        case 2:
            System.out.println("Ucak ile New York, Chicago, Los Angeles");
            break;
        case 3:
            System.out.println("Ucak ile Hong Kong, Beijing, Tokyo");
            break;
        default:
            System.out.println("Hatali Secim! Lutfen yukaridaki numaralardan"
                    + " birini seciniz.");
            break;
        } 
    }
}
