package rizzi.ti23e;

public class Animal {
    String gender;
    String classified;
    String name;
    
    public Animal(){
        gender = "Male";
        classified = "Reptil";
        name = "";
    }
    
    public void setAnimal(String gender, String classified, String name){
        this.gender = gender;
        this.classified = classified;
        this.name = name;
    }
    
    public String getGender(){
        return gender;
    }
    
    public String getClassified(){
        return classified;
    }
    
    public String getName(){
        return name;
    }
}
