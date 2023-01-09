import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int km,yas,yTip;
        double normalTutar,  toplamTutar;

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1-> Tek Yön , 2-> Çift Yön) : ");
        yTip = input.nextInt();

        normalTutar = (km*0.10);
        if (yTip==1){
            if (yas<12){
                toplamTutar = (normalTutar)-(normalTutar*0.50);
                System.out.print("Toplam Tutar : " +toplamTutar);
            } else if (yas>=12 && yas<=24) {
                toplamTutar = (normalTutar)-(normalTutar*0.10);
                System.out.println("Toplam Tutar : " +toplamTutar);

            } else if (yas>65) {
                toplamTutar = (normalTutar)-(normalTutar*0.30);
                System.out.println("Toplam Tutar : " +toplamTutar);

            }else {
                System.out.println("Toplam Tutar : " +normalTutar);
            }

        } else if (yTip==2) {
            if (yas<12){
                toplamTutar = (normalTutar)-(normalTutar*0.50);
                toplamTutar = 2*((toplamTutar)-(toplamTutar*0.20));
                System.out.print("Toplam Tutar : " +toplamTutar);
            } else if (yas>=12 && yas<=24) {
                toplamTutar = (normalTutar)-(normalTutar*0.10);
                toplamTutar = 2*((toplamTutar)-(toplamTutar*0.20));
                System.out.println("Toplam Tutar : " +toplamTutar);

            } else if (yas>65) {
                toplamTutar = (normalTutar)-(normalTutar*0.30);
                toplamTutar = 2*((toplamTutar)-(toplamTutar*0.20));
                System.out.println("Toplam Tutar : " +toplamTutar);

            }else {
                toplamTutar = 2*((normalTutar)-(normalTutar*0.20));
                System.out.println("Toplam Tutar : " +toplamTutar);
            }


        }else {
            System.out.println("Hatalı veri Girdiniz");
        }

    }
}
