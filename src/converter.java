import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class converter {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
     /*  try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
       }*/
        boolean vibor = false;
        System.out.println("1: Перевод из 10 системы счисления в 16 сч ");
        System.out.println("2: Перевод из 10 системы счисления в 2 сч ");
        System.out.println("3: Перевод из 2 системы счисления в 10 сч ");
        int b =0;
       while(!vibor) {
           System.out.print("Введите номер действия: ");
            b = scanner.nextInt();

           if (b > 0 && b < 4) {
               vibor = true;
           }
           else {
               System.out.println("Неправильный выбор");
           }

       }
        switch (b) {
            case 1:
                System.out.print("Введите число которое хотите перевести из 10 сч в 16сч ");
                int с = scanner.nextInt();
                String convert = Integer.toHexString(с);
                System.out.println("Ваше число придставлено в 16 сч: " + convert);
                break;
            case 2:
                System.out.print("Введите число которое хотите перевести из 10 сч в 2сч ");
                int d = scanner.nextInt();
                String conver = Integer.toBinaryString(d);
                System.out.println("Ваше число придставлено в 2 сч: " + conver);
                break;
            case 3:
                System.out.print("Введите число которое хотите перевести из 2 сч в 10сч ");
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                    String h = reader.readLine();
                    int n = 0;
                    int schet = h.length();
                    int number = Integer.parseInt (h);
                    while (schet!=0){
                        if(number%10!=1 && number%10!=0){
                            System.out.println("Ввели неправильноe число");
                            System.exit (1);
                        }
                        schet = schet - 1;
                        number= number / 10;

                    }
                    for (int i = h.length() - 1, j = 1; i >= 0; i--, j *= 2) {
                        n += (h.charAt(i) - '0') * j;
                    }
                    int con = Integer.parseInt(h, 2);
                    System.out.println("Ваше число придставлено в 10 сч: " + n);
                    break;
                }
        }
    }
}


