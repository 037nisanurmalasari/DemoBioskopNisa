/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demobioskopnisa;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class DemoBioskopNisa {

    /**
     * @param args the command line arguments
     */
    abstract static class Penumpang {
        protected String nama;
        protected String noTiket;

        public Penumpang(String nama, String noTiket) {
            this.nama = nama;
            this.noTiket = noTiket;
        }

        public abstract double hitungHargaTiket();

        public void tampilkanData() {
            System.out.println("Nama       : " + nama);
            System.out.println("No Tiket   : " + noTiket);
            System.out.println("Harga Tiket: Rp " + hitungHargaTiket());
        }
    } // <-- PENUTUP CLASS Penumpang (INI WAJIB)

    // ===== REGULER =====
    static class PenumpangReguler extends Penumpang {
        public PenumpangReguler(String nama, String noTiket) {
            super(nama, noTiket);
        }

        @Override
        public double hitungHargaTiket() {
            return 50000;
        }
    }

    // ===== VIP =====
    static class PenumpangVIP extends Penumpang {
        public PenumpangVIP(String nama, String noTiket) {
            super(nama, noTiket);
        }

        @Override
        public double hitungHargaTiket() {
            return 100000;
        }
    }

    // ===== MAIN =====
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Penumpang : ");
        String nama = input.nextLine();

        System.out.print("Masukkan No Tiket       : ");
        String noTiket = input.nextLine();

        System.out.print("Jenis Penumpang (1=Reguler, 2=VIP): ");
        int jenis = input.nextInt();

        Penumpang p;
        if (jenis == 1) {
            p = new PenumpangReguler(nama, noTiket);
        } else {
            p = new PenumpangVIP(nama, noTiket);
        }

        System.out.println("\n=== DATA PENUMPANG ===");
        p.tampilkanData();
    }
}
