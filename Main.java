import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi1, sayi2, secim;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen İlk Değeri Giriniz: ");
        sayi1 = inp.nextInt();

        System.out.print("Lütfen İkinci Değeri Giriniz: ");
        sayi2 = inp.nextInt();

        System.out.println("1 - Toplama \n2 - Çıkarma \n3 - Çarpma \n4 - Bölme ");
        System.out.print("Lütfen yapmak istediğiniz işlemi seçin: ");
        secim = inp.nextInt();

       switch(secim){
           case 1:
               System.out.println("Değeriniz: " + (sayi1 + sayi2));
               break;
           case 2:
               System.out.println("Değeriniz: " + (sayi1 - sayi2));
               break;
           case 3:
               System.out.println("Değeriniz: " + (sayi1 * sayi2));
               break;
           case 4:
               System.out.println((sayi2==0 ? "Bir sayı 0'a bölünemez." : "Değeriniz: " + (sayi1/sayi2)));
               break;
           default:
               System.out.println("Yanlış Değer Girdiniz. Lütfen Tekrar Deneyiniz!");
       }



        /*
        if (secim == 1) {
            System.out.print("Değeriniz: " + (sayi1 + sayi2));
        } else if (secim == 2) {
            System.out.print("Değeriniz: " + (sayi1 - sayi2));
        } else if (secim == 3) {
            System.out.print("Değeriniz: " + (sayi1 * sayi2));
        } else if (secim == 4) {
            if (sayi2 != 0) {
                System.out.print("Değeriniz: " + (sayi1 / sayi2));
            } else {
                System.out.println("Bir sayı 0'a bölünemez! Lütfen tekrar değer giriniz.");
            }
        }
        else {
            System.out.print("Yanlış seçim yaptınız. Lütfen tekrar deneyiniz!");
        }
         */
    }
}