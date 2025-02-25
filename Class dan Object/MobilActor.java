import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MobilActor extends Actor
{
    Mobil mobilku;
    public MobilActor(){
        mobilku = new Mobil();
    }
    
    public void act()
    {
        int x = getX();
        int y = getY();
        
        if(Greenfoot.isKeyDown("left")) x -= mobilku.getKecepatan();
        if(Greenfoot.isKeyDown("right")) x += mobilku.getKecepatan();
        if(Greenfoot.isKeyDown("up")) y -= mobilku.getKecepatan();;
        if(Greenfoot.isKeyDown("down")) y += mobilku.getKecepatan();;
        
        if(Greenfoot.isKeyDown("space")) {
            mobilku.setKecepatan();
        }
        setLocation(x,y);
    }
}
