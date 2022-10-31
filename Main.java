import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select, n3;

        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz. : ");
        n1 = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz. : ");
        n2 = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("1-Toplam\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçimizi : ");
        select = input3.nextInt();
        System.out.println(select);
        switch (select) {

            case 1:
                n3 = n1 + n2;
                System.out.println("Toplam :" + n3);
                break;
            case 2:
                n3 = n1 - n2;
                System.out.println("Çıkarma :" + n3);
                break;
            case 3:
                n3 = n1 * n2;
                System.out.println("Çarpma :" + n3);
                break;
            case 4:
                if (n2 != 0) {
                    n3 = n1 / n2;
                    System.out.println("Bölme :" + n3);
                } else {
                    System.out.println("2. Değer 0 girilemez");
                }
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız");
                break;
        }
    }
}