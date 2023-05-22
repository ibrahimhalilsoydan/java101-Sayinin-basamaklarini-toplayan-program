import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.print("sayı gir: ");
       int number = input.nextInt();


        System.out.print("Girilen sayı :" +number+"");
       int basamakDegeri,total=0,basamakSayisi= 0;

        while (number !=0){
            basamakDegeri = number %10;
            number /= 10;
            total += basamakDegeri;
            basamakSayisi++;


    } System.out.println(" Sayı " + basamakSayisi + " basamaklıdır.");
        System.out.println("Sayı basamakları toplamı :"+total);


    }
}