//13020210242 Nirmala
//Kamis, 09 Maret 2023
// Contoh pengoperasian variabel bertype dasar
public class Operator {
    public static void main(String[] args) {
        boolean Bool1, Bool2, TF;
        //deklarasi variabel Bool1, Bool2, dan TF dengan tipe data boolean
        int i, j, hsl;
        //deklarasi variabel i, j, dan hsl dengan tipe data int
        float x, y, res;
        //deklarasi variabel x, y, dan res dengan tipe data float
        // ALGORITMA
        System.out.println("Silahkan baca teksnya dan tambahkan program dibawah ini untuk menampikan output program");
        //perintah output teks
        Bool1 = true;
        //memberikan value dari variabel Bool1
        Bool2 = false;
        //memberikan value dari variabel Bool2
        TF = Bool1 && Bool2; // Boolean AND
        //memberikan value dari variabel TF 
        System.out.println("TF = Bool1 && Bool2 : " + TF);
        //peritah output teks dan value dari variabel TF
        TF = Bool1 || Bool2; // Boolean OR
        //memberikan value dari variabel TF
        System.out.println("TF = Bool1 || Bool2 : " + TF);
        //peritah output teks dan value dari variabel TF
        TF = !Bool1; // NOT
        //memberikan value dari variabel TF 
        System.out.println("TF = !Bool1         : " + TF);
        //peritah output teks dan value dari variabel TF
        TF = Bool1 ^ Bool2; // XOR
        //memberikan value dari variabel TF 
        System.out.println("TF = Bool1 ^ Bool2  : " + TF);
        //peritah output teks dan value dari variabel TF
        
        // Operasi Numerik
        i = 5;
        //memberikan value dari variabel i
        j = 2;
        //memberikan value dari variabel j
        hsl = i+j;
        //memberikan value dari variabel hsl
        System.out.println("hsl = i+j           : " + hsl);
        //perintah output teks dan value dari variabel hsl
        hsl = i-j;
        //memberikan value dari variabel hsl
        System.out.println("hsl = i-j           : " + hsl);
        //perintah output teks dan value dari variabel hsl
        hsl = i/j;
        //memberikan value dari variabel hsl
        System.out.println("hsl = i/j           : " + hsl);
        //perintah output teks dan value dari variabel hsl
        hsl = i*j;
        //memberikan value dari variabel hsl
        System.out.println("hsl = i*j           : " + hsl);
        //perintah output teks dan value dari variabel hsl
        hsl = i/j; // Pembagian bulat
        //memberikan value dari variabel hsl
        System.out.println("hsl = i/j           : " + hsl);
        //perintah output teks dan value dari variabel hsl
        hsl = i%j; // Sisa Modulo
        //memberikan value dari variabel hsl
        System.out.println("hsl = i%j           : " + hsl);
        //perintah output teks dan value dari variabel hsl
        
        //Operasi Numerik
        x = 5;
        //memberikan value dari variabel x
        y = 5;
        //memberikan value dari variabel y
        res = x+y;
        //memberikan value dari variabel res
        System.out.println("res = x+y           : " + res);
        //perintah output teks dan value dari variabel res
        res = x-y;
        //memberikan value dari variabel res
        System.out.println("res = x-y           : " + res);
        //perintah output teks dan value dari variabel res
        res = x/y;
        //memberikan value dari variabel res
        System.out.println("res = x/y           : " + res);
        //perintah output teks dan value dari variabel res
        res = x*y;
        //memberikan value dari variabel res
        System.out.println("res = x*y           : " + res);
        //perintah output teks dan value dari variabel res
        
        //Operasi Relasional Numerik
        TF = (i==j);
        //memberikan value dari variabel TF
        System.out.println("TF = (i==j)         : " + TF);
        //peritah output teks dan value dari variabel TF
        TF = (i!=j);
        //memberikan value dari variabel TF 
        System.out.println("TF = (i!=j)         : " + TF);
        //peritah output teks dan value dari variabel TF
        TF = (i<j);
        //memberikan value dari variabel TF 
        System.out.println("TF = (i<j)          : " + TF);
        //peritah output teks dan value dari variabel TF
        TF = (i>j);
        //memberikan value dari variabel TF 
        System.out.println("TF = (i>j)          : " + TF);
        //peritah output teks dan value dari variabel TF
        TF = (i<=j);
        //memberikan value dari variabel TF 
        System.out.println("TF = (i<=j)         : " + TF);
        //peritah output teks dan value dari variabel TF
        TF = (i>=j);
        //memberikan value dari variabel TF 
        System.out.println("TF = (i>=j)         : " + TF);
        //peritah output teks dan value dari variabel TF
        
        //Operasi Relasional Numerik
        TF = (x!=y);
        //memberikan value dari variabel TF 
        System.out.println("TF = (x!=y)         : " + TF);
        //peritah output teks dan value dari variabel TF
        TF = (x<y);
        //memberikan value dari variabel TF 
        System.out.println("TF = (x<y)          : " + TF);
        //peritah output teks dan value dari variabel TF
        TF = (x>y);
        //memberikan value dari variabel TF 
        System.out.println("TF = (x>y)          : " + TF);
        //peritah output teks dan value dari variabel TF
        TF = (x<=y);
        //memberikan value dari variabel TF 
        System.out.println("TF = (x<=y)         : " + TF);
        //peritah output teks dan value dari variabel TF
        TF = (x>=y);
        //memberikan value dari variabel TF 
        System.out.println("TF = (x>=y)         : " + TF);
        //peritah output teks dan value dari variabel TF
    }
}
