package gestionzoo.entities;

public class Zoo {

private Animal [] animals;
private String name;
private String city;
private final int nbrCages;
private int animeaucount =0;
private static final int MAX_ANIMAUX = 25;
private Aquatic [] aquaticAnimals;
private int aquaticCount = 0;
private static final int MAX_AQUATIC = 10;


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
    this.aquaticAnimals = new Aquatic[MAX_AQUATIC];


}

  public  boolean addAnimal(Animal animal){
    if (isZooFull() == false){
        animals[animeaucount]=animal;
        animeaucount++;
        return true;
    }
    return false;
    }

    public void addAnimalV2(Animal animal)
    {
        try{

            if (isZooFull()) {
                throw new ZooFullException("zoo is full");
            }
            if (animal.GetAge() < 0){
                throw new InvalidAgeException("Âge d’animal invalide : l’âge ne peut pas être négatif.");
            }

            animals[animeaucount]=animal;
            animeaucount++;

            }catch (ZooFullException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
            catch(InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

    }


   public void afficher(){
    for (int i=0;i<animeaucount;i++) {
        System.out.println(animals[i]);
    }
    }

   public int searchAnimal(Animal animal){
    for (int i=0;i<animeaucount;i++) {
        if (animal.GetName() == animals[i].GetName()) {
            return i;
        }
    }
    return -1;
    }

   public boolean removeAnimal(Animal animal){
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

   public boolean isZooFull() {
        return animeaucount >= nbrCages;
    }

   public Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animeaucount >= z2.animeaucount) {
            return z1;
        } else {
            return z2;
        }
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount < MAX_AQUATIC) {
            aquaticAnimals[aquaticCount] = aquatic;
            aquaticCount++;
        } else {
            System.out.println("le zoo ne peux pas contenir des autres animeaux");
        }
    }

    public void showAquaticSwim() {
        for (int i = 0; i < aquaticCount; i++) {
              aquaticAnimals[i].swim();
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

    public float getMaxPenguinDepth() {
        float maxDepth = 0.0f;

        for (int i = 0; i < aquaticCount; i++) {
            // Vérifie si l’animal aquatique est un pingouin
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin p = (Penguin) aquaticAnimals[i];
                if (p.GetSwimmingDepth() > maxDepth) {
                    maxDepth = p.GetSwimmingDepth();
                }
            }
        }

        return maxDepth;
    }

    public void displayNumbreOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Nombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de pingouins : " + penguinCount);
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
