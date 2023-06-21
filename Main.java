import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String kullaniciAdi = "Java",sifre = "Programlama123";
        String girilenKullaniciAdi,girilenSifre;
        String yeniSifre;
        String secim;
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı Adını Giriniz: ");
        girilenKullaniciAdi = input.nextLine();

        System.out.println("Sifreyi Giriniz: ");
        girilenSifre = input.nextLine();

        if(girilenKullaniciAdi.equals(kullaniciAdi) && girilenSifre.equals(sifre)){
            System.out.println("Giris Basarili:");
        }
        else if (girilenSifre.equals(kullaniciAdi) && !girilenSifre.equals(sifre)){
            System.out.println("Girilen Sifre Hatali!!!");
            System.out.println("Şifreyi Sıfırlamak İster Misiniz ? Evet-Hayır ");
            secim = input.nextLine();
            if(secim.equals("Evet")){
                System.out.println("Yeni Şifrenizi Giriniz! ");
                yeniSifre = input.nextLine();
                if (yeniSifre.equals(sifre)) {
                    System.out.println("Girilen Şifre Önceki Şifreyle Aynı Olamaz !");
                }
                else {
                    sifre = yeniSifre;
                }

            }
            else{
                System.out.println(" ");
            }

        }
        else{
            System.out.println("Kullanıcı Adı Veya Şifre Hatalı !!!");
        }



    }
}