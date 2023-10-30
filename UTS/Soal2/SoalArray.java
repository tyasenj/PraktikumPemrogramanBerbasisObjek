package Soal2;

public class SoalArray {
    public static void main(String[] args) {
        int[][] arrayInt = { { 1, 1, 4 }, { 2, 1, 2 }, { 3, 2, 1 } };
        // hitung jumlah elemen array 2 dimensi
        // gunakan perulangan
        int totalElemen = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                totalElemen += arrayInt[i][j];
            }
        }
        System.out.println("Jumlah elemen dalam array: " + totalElemen);
    }
}
