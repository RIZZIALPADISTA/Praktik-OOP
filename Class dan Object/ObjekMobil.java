package rizzi.ti23e;

public class ObjekMobil {
    public static void main(String[] args) {
        mobil mobilku = new mobil("Merah", 2024, 10);
        mobil mobilmu = new mobil("Putih", 2025, 10);
        
        // mobilku.setDataMobil("Merah", 2024, 10);
        // mobilmu.setDataMobil("Putih", 2025, 10);
        
        mobilku.hidupkanMobil();
        mobilmu.hidupkanMobil();
        
        mobilku.tambahKecepatan(10);
        mobilmu.tambahKecepatan(20);
                 
        mobilku.infoMobil();
        mobilmu.infoMobil();
    }   
}
