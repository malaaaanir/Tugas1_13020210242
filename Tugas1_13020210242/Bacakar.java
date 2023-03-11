//13020210242 Nirmala
//Kamis, 09 Maret 2023
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;
import java.util.*;
import java.io.Console;
public class Bacakar {
    public static void main(String args[]) throws IOException{
        char cc;
        //variabel cc dengan tipe data char
        int bil;
        //variabel bil dengan tipe data integer
        InputStreamReader isr = new
        InputStreamReader(System.in);
        BufferedReader dataIn = new BufferedReader(isr);
        //in
        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
        //Algoritma
        System.out.print("Hello\n");
        //perintah output teks
        System.out.print("Baca 1 Karakter : ");
        //perintah output teks
    
        //Perintah baca dari variabel cc
        cc = dataIn.readLine().charAt(0);
        System.out.print("Baca 1 Bilangan : ");
        //perintah output teks
    
        //Perintah baca bilangan
        bil = Integer.parseInt(datAIn.readLine());
    
        String kar = JOptionPane.showInputDialog("Karakter 1 : ");
        System.out.println(kar);
        //perintah output value dari variabel kar
    
        JOptionPane.showMessageDialog(null, "Hello");
    
        System.out.print(cc + "\n" + bil + "\n");
        //perintah output value variabel cc, teks, variabel bil, dan teks
        System.out.print("Bye\n");
        //perintah output teks dan
        /*Tambahkan program membaca/input data menggunakan 
        Class Scanner, Class Concole dan Class JOptionPane*/
        //Class Scanner
        Scanner inputCS = new Scanner(System.in);
        System.out.println("INPUTAN UNTUK CLASS SCANNER");
        //perintah output teks
        System.out.print("Masukkan inputan : ");
        //perintah output teks
        bil = inputCS.nextInt();
        System.out.println("Output dari Class Scanner : " + bil);
        //perintah output teks dan value dari variabel bil
        //Class Concole
        Console con = System.console();
        System.out.println("INPUTAN UNTUK CLASS CONSOLE");
        //perintah output teks
        System.out.print("Masukan inputan : ");
        //perintah output teks
        bil = Integer.parseInt(con.readLine());
        System.out.println("Output dari Class Console : " + bil);  
        //perintah output teks dan value dari variabel bill
        //Class JOptionPane
        String userenter ;
        //mendeklarasikan variabel userenter bertipe data string
        System.out.println("INPUTAN UNTUK CLASS JOPTION");
        //perintah output teks
        userenter= JOptionPane.showInputDialog("Masukan inputan : ");
        bil = Integer.parseInt(userenter);
        System.out.println("Output dari Class JOption : " + bil);
        //perintah output teks dan value dari variabel bil
    }
}
