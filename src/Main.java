import java.util.Random;
import java.util.Scanner;

public class Main {
    static final int SIZE = 8;

    public static void main(String[] args) {
        int[][] matrix = new int[SIZE][SIZE];
        int[][] rotatedMatrix = new int[SIZE][SIZE];
        randomMatrix(matrix);
        output(matrix);
        System.out.println("На сколько повернуть матрицу?\n 1.90 градусов\n 2.180 градусов\n 3.270 градусов");
        System.out.println();
        turn(matrix, rotatedMatrix);
        output(rotatedMatrix);
    }

    public static void randomMatrix(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrix[i][j] = random.nextInt(256);
            }
        }
    }

    public static void output(int[][] matrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void turn(int[][] matrix, int[][] rotatedMatrix) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                switch (input) {
                    case 1 -> rotatedMatrix[i][j] = matrix[SIZE - 1 - j][i];
                    case 2 -> rotatedMatrix[i][j] = matrix[SIZE - 1 - j][SIZE - 1 - i];
                    case 3 -> rotatedMatrix[i][j] = matrix[SIZE - i - 1][j];
                }
            }
        }
    }
}