import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Vücut kütle indexi hesaplayan program yapmak amaçlanmıştır.
        /*
        Formül = Kg / Boy*Boy
         */

        double kg, boy, hesaplama;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = input.nextDouble();
        System.out.print("Lütfen boyunuzu giriniz ( , ile beraber) : ");
        boy = input.nextDouble();

        hesaplama = kg / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz : " + hesaplama);
        System.out.println(" ");
        

    }
}