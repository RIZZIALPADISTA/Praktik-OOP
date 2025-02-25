/**
 * Write a description of class Mobil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mobil  
{
    // instance variables - replace the example below with your own
    private int kecepatan;

    public Mobil()
    {
        kecepatan = 0;
    }
    
    public void setKecepatan(){
        kecepatan++;
    }
    
    public int getKecepatan(){
        return kecepatan;
    }
}
