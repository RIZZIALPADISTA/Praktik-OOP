package rizzi.ti23e;

public class BujurSangkar extends BangunDatar{
    int luas;
    int keliling;
    
    public BujurSangkar(int panjang, int lebar){
        super(panjang, lebar);
    }
    
    public int getLuas(){
        luas = super.getPanjang() * super.getLebar();
        return luas;
    }
    
    public int getKeliling(){
        keliling = 4 * super.getPanjang();
        return keliling;
    }
    
    public void info(){
        System.out.println("Luas Bujur Sangkar = " + getLuas());
        System.out.println("Keliling Bujur Sangkar = " + getKeliling());
        System.out.println("========================");
    }
}
