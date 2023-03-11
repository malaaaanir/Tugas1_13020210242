//13020210242 Nirmala
//Kamis, 09 Maret 2023
//Pembagian integer, casting
public class Ekspresi1 {
    public static void main(String args[]) {
        int x = 1;
        //variabel x bertipe data integer dengan value 1
        int y = 2;
        //variabel y bertipe data integer dengan value 2
        float fx, fy;
        //variabel fx dan fy bertipe data integer
        /* ALGORITMA */
        System.out.print("X/Y (Format Integer) = " + x/y);
        //perintah output teks dan value dari hasil statement varibel x dan y
        System.out.print("\nX/Y (Format Float) = " + x/y);
        //perintah output teks dan value dari hasil statement varibel x dan y
        //supaya hasilnya tidak nol
        fx=x;
        //mengubah hasil dari variabel x ke variabel fx
        fy=y;
        //mengubah hasil dari variabel y ke variabel fy
        System.out.print("\nX/Y (Format Integer) = " + fx/fy);
        //perintah output teks dan value dari hasil statement varibel fx dan fy
        System.out.print("\nX/Y (Format Float) = "+ fx/fy);
        //perintah output teks dan value dari hasil statement varibel fx dan fy
        //Casting
        System.out.print("\nFloat(x) / Float(y) (Format integer) = " + (float)x/(float)y);
        //perintah output teks dan hasil statement dari variabel x dan y yang di konversi dari tipe data integer ke tipe data float
        System.out.print("\nfloat (y) (format float) = " + (float)x/(float)y);
        //perintah output teks dan hasil statement dari variabel x dan y yang di konversi dari tipe data integer ke tipe data float
        x = 10;
        //memberikan value di variabel x
        y = 3;
        //memberikan value di variabel y
        System.out.print("\nx/y (format integer) = " + x/y);
        //perintah output teks dan value dari hasil statement varibel x dan y
        System.out.print("\nx/y (format float) = " + x/y);
        //perintah output teks dan value dari hasil statement varibel x dan y
    }
}
