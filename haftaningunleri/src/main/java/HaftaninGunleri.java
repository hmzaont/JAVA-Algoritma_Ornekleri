import java.util.Scanner;
public class HaftaninGunleri {
   public static void main(String[]args){
       Scanner giris=new Scanner(System.in);
       System.out.println("Gün seçiniz(1-7): ");
       int gun=giris.nextInt();
       switch(gun){
           case 1: System.out.println("Bugün günlerden Pazartesi");
                   break;
           case 2: System.out.println("Bugün günlerden Salı");
                   break;
           case 3: System.out.println("Bugün günlerden Çarşamba");
                   break;
           case 4: System.out.println("Bugün günlerden Perşembe");
                   break;
           case 5: System.out.println("Bugün günlerden Cuma");
                   break;
           case 6: System.out.println("Bugün günlerden Cumartesi");
                   break;
           case 7: System.out.println("Bugün günlerden Pazar");
                   break;
           default:System.out.println("Hatalı seçim!");
                   System.exit(1);
       }
   } 
}
