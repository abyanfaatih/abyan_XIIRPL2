import java.util.Scanner;

public class suhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celc, fahr, kelv;
       
        System.out.println("~~ Konversi Suhu ~~");
        System.out.println("-----------------------------");
        System.out.println();
        
        System.out.print("Input Suhu Celsius: ");
        celc = input.nextDouble();
        
        fahr = (9.0/5.0 * celc) + 32;
        kelv = celc + 273.15;
        
        System.out.println(celc+"\u00B0C = "+fahr+"\u00B0F (derajat Fahrenheit)");
        System.out.println(celc+"\u00B0C = "+kelv+"\u00B0K (derajat Kelvin)");

        input.close();
    }
}
