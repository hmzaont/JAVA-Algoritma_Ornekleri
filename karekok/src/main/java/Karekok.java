import java.util.Scanner;
public class Karekok {
    public static void main(String args[]){
        Scanner giris = new Scanner(System.in);
        double sayi;
        
        System.out.println("Karekökünü bulacagınız sayıyı giriniz:");
        sayi=giris.nextDouble();
        
        if (sayi<0)
            System.out.println("Hatalı işlem! Pozitif sayı giriniz!");
            
        else
            System.out.println(sayi+"'ın karekökü "+Math.sqrt(sayi));
    }
}
