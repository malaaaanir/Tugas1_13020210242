import java.util.Scanner;
public class Konversi_Waktu{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
        System.out.println("KONVERSI WAKTU");
	System.out.print("Masukkan Detik Yang Akan Dikonversikan : ");
	int nilai_konversi = input.nextInt();
	
	int detikSekarang = nilai_konversi % 60;
        int totalMenit = nilai_konversi /60;
        int menitSekarang = totalMenit % 60;
        int totalJam = totalMenit / 60;
        int jamSekarang = totalJam % 24;
	
        System.out.println("Konversi :");
	System.out.println(jamSekarang + " Jam, " + menitSekarang + " Menit, " + detikSekarang + " Detik");
	}
}