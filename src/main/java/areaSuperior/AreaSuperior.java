package areaSuperior;

import java.io.IOException;
import java.util.Scanner;

public class AreaSuperior {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        int y = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = leitor.nextDouble();
            }
        }

        for (int i = 0, l = 1; i < (M.length / 2) - 1; i++) {
            for (int j = l; j < M.length - l; j++) {
                soma = soma + M[i][j];
                y++;
            }
            l++;
        }

        if (O == 'S') {
            System.out.println(String.format("%.1f", soma));
        } else if (O == 'M') {
            soma /=y;
            System.out.println(String.format("%.1f", soma));
        }
    }
}