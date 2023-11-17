import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Sayı Giriniz: ");
        int s = input.nextInt();

        for (int i = 0; i <=s; i++) {
            if(i%2 == 0){
                System.out.print(i + " :Çift\n");
            }
            else{
                System.out.print(i+" :Tek\n");
            }
        }
        int Total = 0;
        int Sayac = 0;
        int Total1 = 0;
        int Sayac1 = 0;

        for (int i = 0; i <= s; i++) {
            if(i%3==0){

                Total1 += i;
                Sayac1++;
            }
            if(i%4 == 0){

                Total += i;
                Sayac++;
            }

        }

        System.out.printf("3'e Bölünen Sayıların Ortalaması: " + (Total1/Sayac1));
        System.out.printf("\n4'e Bölünen Sayıların Ortalaması: " + (Total/Sayac));

    }
}