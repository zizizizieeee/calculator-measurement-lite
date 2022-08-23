import java.util.Objects;
import java.util.Scanner;

public class AppKalkulatorMeasuremetKue {

    public static java.util.Scanner
            scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        showGreetings();
    }


    /**
     * Menampilkan greeting dan pilihan ingin pilih yang mana
     */
    public static void showGreetings() {
        System.out.println("Hai, Silahkan pilih. Ingin mengkonversikan: ");
        viewShowGreetings();
    }

    /***
     *
     * Test input it works or not
     */
    public static String input(String info) {
        System.out.println(info + ":");
        String data = scanner.nextLine();
        return data;
    }
    public static void testInput() {
        var name = input("Nama");
        System.out.println("Hi, " + name);

        var channel = input("Channel");
        System.out.println(channel);
    }


    public static void viewShowGreetings() {
        while (true) {
            System.out.println("1. Konversi dari Cup ke miliLiter");
            System.out.println("2. Konversi dari Cup ke Gram");
            System.out.println("3. Keluar");

            var input = input("Pilih");
            if (input.equals("1")) {
                viewConversionCupToLitre();
            } else if (input.equals("2")) {
                viewConversionCupToGram();
            } else if (input.equals("3")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    /**
     * Menampilkan 1. Konversi dari cup ke mililiter
     */
    public static void viewConversionCupToLitre() {
        System.out.println("Masukkan jumlah cup yang ingin dikonversikan: ");
            var input1 = Double.parseDouble(input("Cup (desimal)"));
                System.out.println(input1 + " cup = " + input1 * 250 + " ml");
                System.exit(0);
    }

    /**
     * method untuk konversi tepung terigu serba guna dan gula halus
     */
    public static void addConversionFlour() {
        System.out.println("Masukkan jumlah cup yang ingin dikonversikan: ");
        var input3 = Double.parseDouble(input("Cup (desimal)"));
        System.out.println(input3 + " cup = " + input3 * 110 + " gram");
        System.exit(0);
    }

    /**
     * method untuk konversi butter
     */
    public static void addConversionButter() {
        System.out.println("Masukkan jumlah cup yang ingin dikonversikan: ");
        var input4 = Double.parseDouble(input("Cup (desimal)"));
        System.out.println(input4 + " cup = " + input4 * 225 + " gram");
        System.exit(0);
    }

    /**
     * method untuk konversi cokelat bubuk
     */
    public static void addConversionCocoaPowder() {
        System.out.println("Masukkan jumlah cup yang ingin dikonversikan: ");
        var input5 = Double.parseDouble(input("Cup (desimal)"));
        System.out.println(input5 + " cup = " + input5 * 110 + " gram");
        System.exit(0);
    }

    /**
     * method untuk konversi gula
     */
    public static void addConversionSugar() {
        System.out.println("Masukkan jumlah cup yang ingin dikonversikan: ");
           var input6 = Double.parseDouble(input("Cup (desimal)"));
               System.out.println(input6 + " cup = " + input6 * 225 + " gram");
                System.exit(0);
    }

    /**
     * Menampilkan 2. Konversi dari Cup ke Gram
     */
    public static void viewConversionCupToGram() {
        while (true) {
            System.out.println("Masukkan jenis bahan yang ingin dikonversikan: ");
            System.out.println("1. Tepung terigu serba guna dan gula halus");
            System.out.println("2. Mentega (butter) dan margarine");
            System.out.println("3. Coklat bubuk");
            System.out.println("4. Gula pasir");
            System.out.println("5. Kembali ke menu sebelumnya");
            System.out.println("6. Keluar");

            var input2 = input("Pilih");
            if (input2.equals("1")) {
                addConversionFlour();
            } else if (input2.equals("2")) {
                addConversionButter();
            } else if (input2.equals("3")) {
                addConversionCocoaPowder();
            } else if (input2.equals("4")) {
                addConversionSugar();
            } else if (input2.equals("5")) {
                viewShowGreetings();
            } else if (input2.equals("6")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }
}
