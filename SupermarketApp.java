import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SupermarketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username, password, captcha, inputCaptcha;
        boolean loginSuccess = false;

        // Login process
        while (!loginSuccess) {
            System.out.println("+-----------------------------------------------------+");
            System.out.print("Username: ");
            username = scanner.nextLine();
            System.out.print("Password: ");
            password = scanner.nextLine();
            captcha = "AB12"; // Captcha hardcoded for simplicity
            System.out.println("Captcha: " + captcha);
            System.out.print("Enter Captcha: ");
            inputCaptcha = scanner.nextLine();

            // String methods for validation
            if (username.equals("admin") && password.equals("admin321") && inputCaptcha.equals(captcha)) {
                loginSuccess = true;
                System.out.println("Login Berhasil!");
            } else {
                System.out.println("Login Gagal! Silakan coba lagi.");
            }
            System.out.println("+-----------------------------------------------------+");
        }

        // Welcome and transaction details
        System.out.println("Selamat Datang di Supermarket SuperMart");
        
        // Displaying current date and time
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Tanggal dan Waktu: " + dateFormat.format(now));
        System.out.println("+-----------------------------------------------------+");

        // Input transaction details
        System.out.print("No. Faktur: ");
        String noFaktur = scanner.nextLine();
        System.out.print("Kode Barang: ");
        String kodeBarang = scanner.nextLine();
        System.out.print("Nama Barang: ");
        String namaBarang = scanner.nextLine();
        System.out.print("Harga Barang: ");
        double hargaBarang = scanner.nextDouble();
        System.out.print("Jumlah Beli: ");
        int jumlahBeli = scanner.nextInt();

        // Calculating total
        double total = hargaBarang * jumlahBeli;
        scanner.nextLine(); // Consume the newline left-over

        System.out.println("+-----------------------------------------------------+");
        System.out.println("No. Faktur      : " + noFaktur);
        System.out.println("Kode Barang     : " + kodeBarang);
        System.out.println("Nama Barang     : " + namaBarang);
        System.out.println("Harga Barang    : Rp " + hargaBarang);
        System.out.println("Jumlah Beli     : " + jumlahBeli);
        System.out.println("TOTAL           : Rp " + total);
        System.out.println("+-----------------------------------------------------+");

        // Input cashier's name
        System.out.print("Kasir: ");
        String namaKasir = scanner.nextLine();
        System.out.println("Kasir           : " + namaKasir);
        System.out.println("+-----------------------------------------------------+");
    }
}
