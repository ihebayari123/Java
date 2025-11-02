package gestionzoo.entities;

public class Penguin extends Aquatic {
    protected float swimmingDepth;
    public Penguin(){
        super();
        this.swimmingDepth=0.0F;
    }
    public Penguin(String family, String name, int age, boolean isMammal, String habitat,float swimmingDepth) {
        super(family,name,age,isMammal,habitat);
        this.swimmingDepth=swimmingDepth;

    }

    public float GetSwimmingDepth(){
        return swimmingDepth;
    }
    public void SetSwimmingDepth(float swimmingDepth){
        this.swimmingDepth=swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("The penguin " + GetName() + " dives to " + swimmingDepth + " meters deep in " + habitat + ".");
    }


    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth=" + swimmingDepth;
    }

}
