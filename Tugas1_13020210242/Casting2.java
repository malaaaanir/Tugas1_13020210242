//13020210242 Nirmala
//Kamis, 09 Maret 2023
//Casting menggunakan tipe data Class
public class Casting2 {
        public static void main(String args[]) {
        int a=8, b=9;
        //deklarasi variabel a dan b bertipe data integer dengan value a=8 dan b=9
        float d=2.f, e=3.2f;
        //deklarasi variabel d dan e bertipe data float dengan value d=2.0 dan e=3.2
        char g='5';
        //variabel g bertipe data char dengan value 5
        double k=3.14;
        //variabel k bertipe data double dengan value 3.14
        String n="67", m="45", l="100";
        //deklarasi variabel n, m, dan l bertipe data string dengan value 67, 45, dan 100
        
        a = Integer.parseInt(n); 
        //Konversi String ke Integer
        k = Double.parseDouble(m); 
        //Konversi String ke Double
        d = Float.parseFloat(l); 
        //Konversi String ke Float
        System.out.println("A : " + a + "\nK : " + k + "\nD : "+ d);
        //perintah output teks, value dari variabel a, teks, value dari variabel k, teks, dan value dari variabel d
        n = String.valueOf(b);
        //Konversi Integer ke String
        m = String.valueOf(g); 
        //Konversi Karakter ke String
        l = String.valueOf(e); 
        //Konversi Float ke String
        System.out.println("N " + n + "\nM : "+ m + "\nL : " + l);
        //perintah output teks, value dari variabel n, teks, value dari variabel m, teks, dan value dari variabel l
        k = Double.valueOf(a).intValue(); 
        //Konversi Double ke Integer
        double c = Integer.valueOf(b).doubleValue();
        //Konversi Integer ke Double
        System.out.println("K : " + k + "\nC : "+ c + "\nL : " + l);
        //perintah output teks, value dari variabel k, teks, value dari variabel c, teks, dan value dari variabel l
    }
}
