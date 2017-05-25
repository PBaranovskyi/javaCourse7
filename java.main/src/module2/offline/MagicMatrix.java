package module2.offline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by citsym on 04.05.17.
 */
public class MagicMatrix {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("text.txt"));

        System.out.println("Please input the matrix size:");


        int matrixSize = scanner.nextInt();

        int[][] matrixArray = new int[matrixSize][matrixSize];


        for (int j = 0; j < matrixSize; j++) {

            for (int i = 0; i < matrixSize; i++) {
                int next = scanner.nextInt();

                matrixArray[j][i] = next;
            }

        }


        int horizontalSum = 0;
        int verticalSum = 0;
        int diagonalSum = 0;
        int diagonalSumReverse = 0;

        int magicConstant = 0;

        for (int i = 0; i < matrixSize; i++) {
            magicConstant += matrixArray[0][i];
        }

        for (int j = 0; j < matrixSize; j++) {


            for (int i = 0; i < matrixSize; i++) {

                horizontalSum += matrixArray[j][i];
                verticalSum += matrixArray[i][j];
            }
            diagonalSum += matrixArray[j][j];
            diagonalSumReverse += matrixArray[matrixSize-j-1][matrixSize -j - 1];

            if (horizontalSum != magicConstant
                    || verticalSum != magicConstant) {
                System.out.println("It`s not a magic matrix ");
                return;
            }
            verticalSum = 0;
            horizontalSum = 0;

            System.out.println();

        }

        if (diagonalSum != magicConstant
                || diagonalSumReverse != magicConstant) {
            System.out.println("It`s not a magic matrix ");
            return;
        }

        for (int j = 0; j < matrixSize; j++) {

            for (int i = 0; i < matrixSize; i++) {
                System.out.print(matrixArray[j][i] + " ");
            }
            System.out.println();

        }
        System.out.println("It`s magic ");

    }
}
