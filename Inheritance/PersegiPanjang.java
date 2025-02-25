package rizzi.ti23e;

public class PersegiPanjang extends BangunDatar{
    int luas;
    
    public PersegiPanjang(int panjang,int lebar){
        super(panjang, lebar);
    }
    
    public int getLuas(){
        luas = super.getPanjang() * super.getLebar();
        return luas;
    }

    public void info(){
        System.out.println("Luas Persegi Panjang = " + getLuas());
        System.out.println("========================");
    }
}
