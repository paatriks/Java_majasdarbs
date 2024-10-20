// Sastādīt algoritmu, kas aprēķina visu pāra (S1) un nepāra (S2) skaitļu summu no 1 līdz N (N ievada  lietotājs).

import java.util.Scanner;
public class Ciklisks {
    public static void main(String[] args) {
        Scanner ievade = new Scanner(System.in);

        System.out.print("Ievadi skaitli: ");
        int N = ievade.nextInt();

        int S1 = 0, S2 = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                S1 += i;
            }
            else {
                S2 += i;
            }
        }
        System.out.println("visu pāra skaitļu summa: " + S1);
        System.out.println("visu nepāra skaitļu summa: " + S2);

        ievade.close();
    }
}
