import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year,kalanYüz,kalanDört,kalanDörtYüz;

        Scanner input = new Scanner(System.in);
        System.out.print("Merak edilen yılı giriniz: ");
        year = input.nextInt();
        // 100ün katı olanlar ve 4ün katı olanlar olarak iki farklı mod hesabı gerekli.
        kalanDört=year%4;
        kalanYüz=year%100;
        kalanDörtYüz=year%400;
        if(kalanYüz==0){
            if(kalanDörtYüz==0){
                System.out.println(year+" bir artık yıldır.");
            }else{
                System.out.println(year+" bir artık yıl değildir.");
            }

        }else if(kalanDört==0){
            System.out.println(year+" bir artık yıldır.");
        }else{
            System.out.println(year+" bir artık yıl değildir");
        }
    }
}
