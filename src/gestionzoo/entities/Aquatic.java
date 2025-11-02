package gestionzoo.entities;

public abstract class Aquatic extends Animal {

    protected String habitat; // optional new field

    public Aquatic(){
        super();
        this.habitat="";
    }
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public abstract void swim();

    @Override
    public String toString() {
        return super.toString() + ", habitat='" + habitat + "'";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Aquatic other = (Aquatic) obj;

        // Vérifie name, age et habitat
        return this.GetName().equals(other.GetName()) &&
                this.GetAge() == other.GetAge() &&
                this.habitat.equals(other.habitat);
    }

}
