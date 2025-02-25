package rizzi.ti23e;

public class mobil {
    
    String warna;
    int tahun;
    int kecepatan;
    boolean status = false;
    
    public mobil(String c, int y, int kecepatan){
        warna = c;
        tahun = y;
        // Jika variabel di gobal sama dengan variabel di local maka gunakan fungsi this.
        this.kecepatan = kecepatan;
        
    }
    
    // Mutator/Setter Method
    public void setDataMobil(String c, int y, int kecepatan){
        warna = c;
        tahun = y;
        // Jika variabel di gobal sama dengan variabel di local maka gunakan fungsi this.
        this.kecepatan = kecepatan;
    }
    
    // Getter/Acccessor Method
    public String getWarna(){
        return warna;
    }
    
    public int getTahun(){
        return tahun;
    }
     
    public int getKecepatan(){
        return kecepatan;
    }
    
    public void tambahKecepatan(int k){
        if(status==true){
           kecepatan += k; 
        }
        else{
            System.out.println("Mobil masih mati");
        }
    }
    
    public void hidupkanMobil(){
        status = true;
    }
    
    public void matikanMobil(){
        status = false;
    }
    
    public void infoMobil(){
        System.out.println("Warna Mobil:" + getWarna());
        System.out.println("Tahun Pembuatan:" + getTahun());
        System.out.println("Kecepatan:" + getKecepatan());
        System.out.println("=========================");
    }
    
    
}

