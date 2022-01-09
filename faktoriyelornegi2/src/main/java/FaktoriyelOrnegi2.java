import java.util.Scanner;

public class FaktoriyelOrnegi2 {
    public static void main(String[]args){
        System.out.println("Klavyeden bir sayı giriniz:");
        Scanner klavye= new Scanner(System.in);
        int giris=klavye.nextInt();
        int sonuc=1;
        for(int i=1; i<=giris; i++)
        {
            sonuc=sonuc*i;
        }
        System.out.println(sonuc);
    }
}
