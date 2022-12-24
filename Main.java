import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import java.util.Formatter;
public class Main {
    public static void main(String[] args) {
        System.out.println("Selamat Datang di Penjahit Cussons");

        Perusahaan prop = new Perusahaan();
        try (Formatter rile = new Formatter("D:\\TUGAS PBO\\Tugas016\\src\\Pbo.txt")){
        String nama ="Cussons";
        rile.format(nama);
        String berdiri ="Majalengka, 09-Januari-2008";
        rile.format(berdiri);
        String moto ="Usaha Tidak Akan Mengkhianati Hasil";
        rile.format(moto);
        prop.mbio();
        prop.Data(nama, berdiri, moto);
        Profil.Profil2 tes = new Profil.Profil2() {
            @Override
            public void perintis() {
                System.out.println("Perintis       : "+""+Perintis);
                rile.format("\n");
                rile.format(Perintis);
            }

            @Override
            public void Alamat() {
                System.out.println("Alamat         : "+""+alamat);
                rile.format("\n");
                rile.format(alamat);
            }
        };
        tes.perintis();
        tes.Alamat();
    }catch(FileNotFoundException ex){
        System.out.println("File Tidak Ditemukan");
    }

        System.out.println("=============================================");
        System.out.println("|         APLIKASI PENJAHIT CUSSONS         |");
        System.out.println("| 1. Lanjut                                 |");
        System.out.println("| 2. Keluar                                 |");
        System.out.println("=============================================");
        System.out.println();
        Scanner input = new Scanner(System.in);
        int pilih;
        int choise;
        choise = input.nextInt();
        if (choise == 1) {
            System.out.println("Silahkan isikan data");
            System.out.println("1. Iya");
            System.out.println("2. Tidak");
            System.out.println("Pilih :  ");
            pilih = input.nextInt();
            if (pilih == 1) {

                Penjahit Jahit = new Penjahit();
                Jahit.input_data();
                Jahit.update_data();
                Pelanggan Pelanggan = new Pelanggan();
                Pelanggan.input_data();
                Pelanggan.lihat_data();
                Bahan bhn = new Bahan();
                bhn.input_data();
                bhn.update_data();
                Jahitmenjahit Menjahit = new Jahitmenjahit();
                Menjahit.input_data();
                Menjahit.jenis_kelas();
                Menjahit.update_data();
            } else if (pilih == 2) {
                System.exit(0);
            } else {
                System.out.println("INVALID !!!");
                System.exit(0);
            }
        }else{
            System.out.println("KELUAR");
            System.exit(0);
        }


        //MODIFIKASI PROGRAM CLASS ABSTRACT
        System.out.println("========================================================");
        System.out.println("               PEMBAYARAN                |     HARGA    ");
        System.out.println("1. Paket cepat                           |   Rp 500000  ");
        System.out.println("2. Paket santai                          |   Rp 100000  ");
        System.out.println("========================================================");
        System.out.println("Masukan Pilihan Anda = ");
        pilih = input.nextInt();
        System.out.println();
        if (pilih == 1) {
            Tagihan tagih = new Tagihan(500000);
            System.out.println("Total Bayar : " + tagih.pembayaran());
        } else if (pilih == 2) {
            Tagihan tagih = new Tagihan(100000);
            System.out.println("Total Bayar : " + tagih.pembayaran());
        }

    }
}