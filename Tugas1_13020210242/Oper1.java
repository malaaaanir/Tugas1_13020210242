//13020210242 Nirmala
//Kamis, 09 Maret 2023
// Pemakaian beberapa operator terhadap bit
public class Oper1 {
    public static void main(String args[]) {
        int n = 10; //1010
        //variabel n bertipe data integer dengan value 10
        int x = 1; //1
        //variabel x bertipe data integer dengan value 1
        int y = 2; //10
        //variabel y bertipe data integer dengan value 2
        // ALGORITMA
        System.out.println("N = " + n);
        //perintah output teks dan value dari variabel n
        System.out.println("X = " + x);
        //perintah output teks dan value dari variabel x
        System.out.println("Y = " + y);
        //perintah output teks dan value dari variabel y
        System.out.println("N & 8 = " + (n & 8)); // 1010 AND 1000
        //perintah output teks dan hasil operator n & 8
        System.out.println("X & 8 = " + (x & ~8)); // 1 AND 0111
        //perintah output teks dan hasil operator x 
        System.out.println("Y << 2 = " + (y << 2)); // 10==> 1000 = 8
        //perintah output teks dan hasil left shift y<<2
        System.out.println("Y >> 3 = " + (y >> 3)); // 10==> 0000 = 0
        //perintah output teks dan hasil left shift y>>3
    }
}
