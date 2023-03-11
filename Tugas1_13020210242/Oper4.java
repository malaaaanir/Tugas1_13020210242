//13020210242 Nirmala
//Kamis, 09 Maret 2023
//Operator terner
public class Oper4 {
    public static void main(String args[]) {
        int i = 0; //perhatikan int i,j=0 bukan seperti ini
        //variabel i bertipe data integer dengan value 0
        int j = 0;
        //variabel j bertipe data integer dengan value 1
        char c = 8, d =10;
        //deklarasi variabel c dan d bertipe data char dengan value 8 dan 10
        int e = (((int)c>(int)d) ? c:d);
        //deklarasi variabel e dengan value hasil dari variabel c> dengan variabel d
        int k = ((i>j) ? i:j);
        //deklarasi variabel e dengan value hasil dari variabel i> dengan variabel j
        // ALGORITMA
        System.out.print("Nilai e = " + e);
        //perintah output teks dan value dari variabel e
        System.out.print("\nNilai k = " + k);
        //perintah output teks dan value dari variabel k
        i = 2;
        //mengubah value dari variabel i menjadi 2
        j = 3;
        //mengubah value dari variabel j menjadi 3
        k = ((i++>j++) ? i:j);
        //mengubah value dari variabel k menjadi hasil dari i++>j++
        System.out.print("\nNilai k = " + k);
        //perintah output teks dan value dari variabel k
    }
}
