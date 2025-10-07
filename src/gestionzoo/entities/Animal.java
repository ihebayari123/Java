package gestionzoo.entities;

public class Animal {

    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal (String family,String name,int age,boolean isMammal){
        this.family=family;
        this.name=name;
        SetAge(age);
        this.isMammal=isMammal;
    }

    @Override
    public String toString() {
        return "gestionzoo.entities.Animal{name='" + name + "', family='" + family + "', age=" + age + ", isMammal=" + isMammal + "}";
    }

    public void Setfamily(){
        this.family=family;
    }
    public String Getfamily(){
        return family;
    }
    public void SetName(){
        this.name=name;
    }
    public String GetName(){
        return name;
    }
    public void SetAge(int age){
        if (age<0){
            System.out.println("age doit etre positive");
            this.age=0;
        }else{
        this.age=age;
        }
    }
    public int GetAge(){
        return age;
    }
    public boolean isMammal(){
        return isMammal;
    }



}
