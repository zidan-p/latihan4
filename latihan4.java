
package latihanPBO;
import java.util.Scanner;   //malkukan import Scanner

public class latihan4 {


    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);   //membuat Scanner baru
        int a,b;    //mendeklarasikan variabel
        System.out.println("masukan nilai a :");    //menampilkam kalimat
        a = masukan.nextInt();  //memberi nilai varibel menggunakan input key board
        System.out.println("masukan nilai b :");
        b = masukan.nextInt();  //memberi nilai varibel menggunakan input key board
        
        System.out.println("\nnilai variabel ada pada program:");
        System.out.println("a = "+a);   //menampilkan kalimat dan variabel
        System.out.println("b = "+b);   //menampilkan kalimat dan variabel
    }
    
}
