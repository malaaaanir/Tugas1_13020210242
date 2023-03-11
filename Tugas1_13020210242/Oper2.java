//13020210242 Nirmala
//Kamis, 09 Maret 2023
// Pemakaian beberapa operator terhadap RELATIONAL DAN bit
public class Oper2 {
    public static void main(String[] args) {
        char i, j;
        //deklarasi variabel i dan j bertipe data char
        // ALGORITMA
        i = 3; // 00000011 dalam biner
        //memberikan value dari variabel i
        j = 4; // 00000100 dalam biner
        //memberikan value dari variabel j
        System.out.println("i = " + (int) i);
        //perintah output teks dan hasil dari konversi tipe data char menjadi integer variabel i
        System.out.println("j = " + j);
        //perintah output teks dan hasil dari variabel j
        System.out.println("i & j = " + (i & j));
        //perintah output teks dan hasil dari operator i&j dengan tipe data char
        // 0: 00000000 dalam biner
        System.out.println("i | j = " + (i | j));
        //perintah output teks dan hasil dari operator i|j dengan tipe data char
        // 7: 00000111 biner
        System.out.println("i ^ j = " + (i ^ j));
        //perintah output teks dan hasil dari operator i^j dengan tipe data char
        /* 7: 00000111 biner Ingat!!! operator "^" 
        pada bahasa java bukan sebagai pangkat*/
        System.out.println(Math.pow(i, j));
        //perintah output hasil dari hasil pangkat value variabel i dan j
        // Class Math memiliki method pow(a,b) untuk pemangkatan
        System.out.println("~i = " + ~i);
        //perintah output teks dan negasi hasil dari variabel i
        // ~4: 11111100 biner
    }
}
