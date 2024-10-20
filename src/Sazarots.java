/* Sastādīt algoritmu, kas nosaka, vai konkrētais gads (G) ir garais gads.
Gadu ievada lietotājs. Gads ir garais gads, ja tas dalās ar 4.
Taču, ja gads dalās arī ar 100, tam ir jādalās arī ar 400, lai tas būtu garais gads.
*/

import java.util.Scanner;
public class Sazarots {
    public static void main(String[] args) {
        Scanner ievade = new Scanner(System.in);

        System.out.print("Ievadi gadu: ");
        int G = ievade.nextInt();

        int N = G % 4;
        int X = G % 100;
        int Y = G % 400;

        if (N == 0) {
            if (X == 0) {
                if (Y == 0) {
                    System.out.println(G + " ir garais gads");
                }
                else {
                    System.out.println(G + " nav garais gads");
                }
            }
            else {
                System.out.println(G +  " ir garais gads");
            }
        }
        else {
            System.out.println(G + " nav garais gads");
        }
        ievade.close();
    }
}
