package rizzi.ti23e;

public class SegiTiga extends BangunDatar{
    int alas;
    int tinggi;
    
    public SegiTiga(int panjang, int lebar){
        super(panjang, lebar);
    }
    
     public int getAlas(){
        alas = super.getLebar() * super.getPanjang() / 2;
        return alas;
    }
    
    public int getTinggi(){
        tinggi = 3 * super.getPanjang();
        return tinggi;
    }
    
    public void info(){
        System.out.println("Luas Segi Tiga = " + getAlas());
        System.out.println("Keliling Segitiga = " + getTinggi());
        System.out.println("========================");
    }
}
