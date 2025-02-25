package rizzi.ti23e;

public class Crocodile extends Animal {
    
    int age;
    
    public Crocodile(int age){
        super.name = "Crocodile";
        this.age = age;
        super.classified = "Reptil";
    }
    
    public void info(){
        System.out.println("My name is:" + super.name);
        System.out.println("Age:" + getAge());
        System.out.println("Classified:" + super.classified);
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }
}

