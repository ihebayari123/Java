package gestionzoo.entities;

public class Zoo {

private Animal [] animals;
private String name;
private String city;
private final int nbrCages;
private int animeaucount;
private static final int MAX_ANIMAUX = 25;
public Zoo(String name,String city,int nbrCages){
    if (nbrCages > MAX_ANIMAUX) {
        System.out.println("Le nombre de cages dépasse la capacité maximale");
        this.nbrCages = MAX_ANIMAUX;
    }
    else {
        this.nbrCages = nbrCages;
    }

    SetName(name);
    this.city=city;

    this.animals=new Animal[nbrCages];

}

    boolean addAnimal(Animal animal){
    if (isZooFull()){
        animals[animeaucount]=animal;
        animeaucount++;
        return true;
    }
    return false;
    }

    void afficher(){
    for (int i=0;i<animeaucount;i++) {
        System.out.println(animals[i]);
    }
    }

    int searchAnimal(Animal animal){
    for (int i=0;i<animeaucount;i++) {
        if (animal.GetName() == animals[i].GetName()) {
            return i;
        }
    }
    return -1;
    }

    boolean removeAnimal(Animal animal){
        int x=searchAnimal(animal);
     if (searchAnimal(animal) == -1 ) return false;
     else{
         for (int i=x;i<animeaucount-1;i++) {
             animals[i] = animals[i + 1];
         }

         animeaucount--;
         return true;
     }
    }

    boolean isZooFull() {
        return animeaucount >= nbrCages;
    }

    Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animeaucount >= z2.animeaucount) {
            return z1;
        } else {
            return z2;
        }
    }

    public String GetName() {
        return name;
    }

    public void SetName(String name) {
        if (name == null) {
            System.out.println("le nom du zoo ne doit pas etre vide.");
        } else {
            this.name = name;
        }
    }
    public String getCity() {
        return city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getAnimalCount() {
        return animeaucount;
    }
}
