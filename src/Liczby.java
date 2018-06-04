import java.util.Scanner;

public class Liczby {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int x = scanner.nextInt();

        while (x < 100 || x > 200 || x % 3 != 0) {
            if (x > 200) {
                System.out.println("Twoja liczba jest za duża. Proszę podać następną");
                x = scanner.nextInt();
            } else if (x < 100) {
                System.out.println("Twoja liczba jest za mała! Proszę podać następną");
                x = scanner.nextInt();
            } else {
                System.out.println("Twoja liczba nie jest podzielna przez 3");
            }
        }
        System.out.println("Podana przez Ciebie liczba jest dobra!");
    }
}
