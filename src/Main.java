import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k, topalm = 0, bolen = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Sayi Giriniz: ");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                bolen++;
                topalm += i;
            }
        }
        int ortalama = topalm / bolen;
        System.out.println("3 ve 4 ile tam bölünen sayılarınızın Ortalaması: "+ortalama);
    }
}
