package rizzi.ti23e;

public class Tiger extends Animal {
    
    int age;
    
    public Tiger(int age){
        super.name = "Tiger";
        this.age = age;
        super.classified = "Mamalia";
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
