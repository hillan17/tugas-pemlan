import java.util.Scanner;

import Kelas.clsLingkaran;
public class objLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        clsLingkaran lingA = new clsLingkaran();
        System.out.println("Program menghitung luas dan keliling lingkaran");
        System.out.print("Masukkan nilai jari-jari :");

        lingA.jejari = input.nextInt();

        System.out.println("Luas Lingkaran " + lingA.getLuas());
        System.out.println("Keliling Lingkaran " + lingA.getKeliling());

        clsLingkaran lingB = new clsLingkaran();
        lingB.jejari = 100;
        System.out.println("Luas Lingkaran : " + lingB.getLuas());
        System.out.println("Keliling Lingkaran : " + lingB.getKeliling());

        input.close();
    }
}
