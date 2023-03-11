//13020210242 Nirmala
//Kamis, 09 Maret 2023
//Casting menggunakan tipe data primitif
public class Casting1 {
    public static void main(String args[]) {
        int a=5, b=6;
        //deklarasi variabel a dan b bertipe data integer dengan value a=5 dan b=6
        float d=2.f, e=3.2f;
        //deklarasi variabel d dan e bertipe data float dengan value d=2.0 dan e=3.2
        char g='5';
        //variabel g bertipe data char dengan value 5
        double k=3.14;
        //variabel k bertipe data double dengan value 3.14
        System.out.println((float)a); // int <-- float
        //perintah konversi tipe data integer dari variabel a menjadi tipe data float
        System.out.println((double)b); // int <-- double
        //perintah konversi tipe data integer dari variabel b menjadi tipe data double
        System.out.println((int)d); //float <-- int
        //perintah konversi tipe data float dari variabel d menjadi tipe data integer
        System.out.println((double)e); //float <-- double
        //perintah konversi tipe data float dari variabel e menjadi tipe data double
        System.out.println((int)g); //char <-- int (ASCII)
        //perintah konversi tipe data char dari variabel g menjadi tipe data integer
        System.out.println((float)g); //char <-- float (ASCII)
        //perintah konversi tipe data char dari variabel g menjadi tipe data float
        System.out.println((double)g); //char <-- double (ASCII)
        //perintah konversi tipe data char dari variabel g menjadi tipe data double
        System.out.println((int)k); //double <-- int
        //perintah konversi tipe data double dari variabel k menjadi tipe data integer
        System.out.println((float)k); //double <-- float
        //perintah konversi tipe data double dari variabel k menjadi tipe data float
    }
}
