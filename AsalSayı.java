import java.util.Scanner;

public class AsalSayı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        // Asal sayıyı kontrol ediyoruz
        if (isAsal(sayi)) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }
    }

    // Asal sayıyı kontrol eden metot
    public static boolean isAsal(int sayi) {
        // 1 ve daha küçük sayılar asal sayı değildir
        if (sayi <= 1) {
            return false;
        }

        // 2 sayısı asal bir sayıdır
        if (sayi == 2) {
            return true;
        }

        // 2'den büyük olan sayılar için kontrol
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            // Eğer sayı i ile bölünebiliyorsa, asal değildir
            if (sayi % i == 0) {
                return false;
            }
        }

        // Eğer bölünecek bir sayı bulunamazsa, sayı asal bir sayıdır
        return true;
    }
}
