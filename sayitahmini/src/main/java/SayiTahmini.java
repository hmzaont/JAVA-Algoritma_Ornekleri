import java.util.Scanner;
public class SayiTahmini {
    public static void main(String[]args){
        int sayi=(int)(Math.random()*101);
        Scanner giris=new Scanner(System.in);
        System.out.println("0 ile 100 arasındaki sihirli "
        +"bir sayı tahmin ediniz: ");
        int tahmin=-1;
        while(tahmin!=sayi){
            System.out.print("\nTahmin ediniz: ");
            tahmin=giris.nextInt();
            if(tahmin==sayi)
                System.out.println("Evet, sayı "+sayi);
                else if(tahmin>sayi)
                    System.out.println("Tahmininiz çok büyük");
                else
                    System.out.println("Tahmininiz çok küçük");
            }
        }
    }
