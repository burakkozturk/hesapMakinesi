import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         switch case
         **/


        int select , s1 ,s2 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Ilk Sayıyı Giriniz : ");
        s1 = input.nextInt();
        System.out.println("Ikinci Sayıyı Giriniz : ");
        s2 = input.nextInt();


        System.out.println("Yapmak Istediğiniz Islemi Secin \n 1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme ");
        select = input.nextInt();


        switch (select){
            case 1 :
                System.out.println("Toplama Sonucu : "+(s1+s2));
                break;
            case 2 :
                System.out.println("Cikarma Sonucu : "+(s1-s2));
                break;
            case 3 :
                System.out.println("Carpma Sonucu : "+(s1*s2));
                break;
            case 4 :
                System.out.println("Bolme Sonucu : "+(s1/s2));
                break;
        }



    }
}