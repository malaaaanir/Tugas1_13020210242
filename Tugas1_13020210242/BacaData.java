//13020210242 Nirmala
//Kamis, 09 Maret 2023
import java.util.Scanner;
//berfungsi sebagai perintah untuk penginputan class scanner
public class BacaData {
    public static void main(String args[]) {
        int a; 
        //variabel a bertipe data integer 
        Scanner masukan; 
        //mendeklarikan perintah masukan
        //Program
        System.out.println("Contoh membaca dan menulis, ketik nilai integer : \n");
        //perintah output teks
        masukan = new Scanner(System.in);
        //syntax pembuatan class scanner untuk perintah input class scanner
        a = masukan.nextInt();
        //mendeklarasikan bahwa variabel a yang akan menggantikan perintah input masukan
        //coba ketik : masukan.nextInt(); Apa akibatnya?
        masukan.nextInt();
        //sebagai perintah input nilai dari masukan
        /*
        ketika di tambahkan masukan.nextInt, maka pada program
        akan ada perintah untuk menginput nilai integer
        */
        System.out.print("Nilai yang dibaca : " + a);
        //perintah output teks dan value dari variabel a
    }
}
