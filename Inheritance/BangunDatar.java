package rizzi.ti23e;

public class BangunDatar {
    
    int panjang;
    int lebar;
    
    public BangunDatar(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public void setBangunDatar(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public int getPanjang(){
        return panjang;
    }
    
    public int getLebar(){
        return lebar;
    }
}
