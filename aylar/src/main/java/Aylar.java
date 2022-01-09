import java.util.Scanner;
public class Aylar {
    public static void main(String[]args){
        Scanner giris=new Scanner(System.in);
        String[]aylar={"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz",
                "Ağustos","Eylül","Ekim","Kasım","Aralık"};
        System.out.println("Bir ay no(1-12) giriniz: ");
        int ayNo=giris.nextInt();
        System.out.println("Ay: "+aylar[ayNo-1]);
        }
    }
