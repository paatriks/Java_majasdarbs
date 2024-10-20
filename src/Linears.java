/* Sastādīt algoritmu, kas ļauj lietotājam aprēķināt kopējo nobraukto attālumu gan kilometros (K),
 gan metros (M), gan centimetros (C).
 Lietotājs ievada ātrumu (V)  (km/h) un nobraukto laiku (T) (stundās).
*/

import java.util.Scanner;
public class Linears {
    public static void main(String[] args) {
        Scanner ievade = new Scanner(System.in);

        System.out.print("ievadi ātrumu (km/h): ");
        int V = ievade.nextInt();

        System.out.print("Ievadi nobraukto laiku (stundās): ");
        int T = ievade.nextInt();

        int K = V * T;
        int M = K * 1000;
        int C = K * 100000;

        System.out.println("Kopējais nobrauktais attālums: ");
        System.out.println("Kilometri: " + K + " km");
        System.out.println("Metri: " + M + " m");
        System.out.println("Centimetri: " + C + " cm");

        ievade.close();
    }
}
