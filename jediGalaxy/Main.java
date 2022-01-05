package jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] galaxy = galaxyReader(scanner);

        String command = scanner.nextLine();

        long sum = 0;

        while (!command.equals("Let the Force be with you")) {

            int[] lightSide = Arrays.stream(command.split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            int rowLight = lightSide[0];
            int colLight = lightSide[1];

            int[] evilSide = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            int rowEvil = evilSide[0];
            int colEvil = evilSide[1];

            while (rowEvil >= 0 && colEvil >= 0) {

                if (rowEvil >= 0 && rowEvil < galaxy.length &&
                        colEvil >= 0 && colEvil < galaxy[0].length) {
                    galaxy[rowEvil][colEvil] = 0;
                }
                rowEvil--;
                colEvil--;
            }

            while (rowLight >= 0 && colLight < galaxy[1].length) {

                if (rowLight >= 0 && rowLight < galaxy.length &&
                        colLight >= 0 && colLight < galaxy[0].length) {
                    sum += galaxy[rowLight][colLight];
                }
                colLight++;
                rowLight--;
            }

            command = scanner.nextLine();
        }

        System.out.println(sum);
    }

    private static int[][] galaxyReader(Scanner scanner) {
        int[] dimestions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimestions[0];
        int cols = dimestions[1];

        int[][] galaxy = new int[rows][cols];

        fillGalaxy(rows, cols, galaxy);
        return galaxy;
    }

    private static void fillGalaxy(int rows, int cols, int[][] galaxy) {
        int value = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                galaxy[i][j] = value++;
            }
        }
    }
}
