package rizzi.ti23e;

import java.util.Scanner;

public class ObjectBangunDatar {
    public static void main(String[] args) {
        System.out.println("===========");
        System.out.println("1. Bujur Sangkar");
        System.out.println("2. Segi Tiga");
        System.out.println("3. Persegi Panjang");
        System.out.println("===========");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Pilihan: ");
        int pilihan = sc.nextInt();
        
        if(pilihan == 1){
            System.out.println("Isikan Panjang:");
            int panjang = sc.nextInt();
            System.out.println("Isikan Lebar");
            int lebar = sc.nextInt();
            
            if(panjang == lebar){
                BujurSangkar bs = new BujurSangkar(panjang, lebar);
                int l = bs.getLuas();
                int k = bs.getKeliling();
                bs.info();
            }
            else{
                System.out.println("Panjang dan Lebar harus sama.");
            }
        }
        if(pilihan == 2){
            System.out.println("Isikan Alas:");
            int panjang = sc.nextInt();
            System.out.println("Isikan Tinggi");
            int lebar = sc.nextInt();
            
            if(panjang == lebar){
                SegiTiga st = new SegiTiga(panjang, lebar);
                int p = st.getAlas();
                int q = st.getTinggi();
                st.info();
            }
            else{
                System.out.println("Panjang dan Lebar harus sama.");
            }    
        }
        
        if(pilihan == 3){
            System.out.println("Isikan Panjang:");
            int panjang = sc.nextInt();
            System.out.println("Isikan Lebar");
            int lebar = sc.nextInt();
            
            if(panjang == lebar){
                PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
                int w = pp.getLuas();
                pp.info();
            }
            else{
                System.out.println("Panjang dan Lebar harus sama.");
            }
        }
        
    }
}
