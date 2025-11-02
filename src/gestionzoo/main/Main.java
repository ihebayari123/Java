package gestionzoo.main;
import gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {
        int x;
        boolean test;
Zoo zoo=new Zoo("belvidere","Tunis",2);
Animal lion=new Animal("fefef","Lion",3,true);
Animal fakroun=new Animal("ededf","fakroun",7,false);
Animal elephant = new Animal("Elephant", "Elephant", -2, true);
Animal chien=new Animal("dazd","kleb",1,true);


Dolphin dolphin = new Dolphin("dalaphin","zoro",2,false,"dddd", 1.2341F);
Penguin penguin = new Penguin("penguinet","dali",4,true,"ddd",1.2F);
Dolphin dolphin2 = new Dolphin("dalaphin","bringa",2,false,"dddd", 1.2341F);

        /*System.out.println("Add Lion: " + zoo.addAnimal(lion));
        System.out.println("Add Fakroun: " + zoo.addAnimal(fakroun));
        System.out.println("Add Elephant: " + zoo.addAnimal(elephant));*/

        zoo.addAnimalV2(lion);
        zoo.addAnimalV2(fakroun);
        zoo.addAnimalV2(elephant);
        zoo.addAnimalV2(chien);

        zoo.addAquaticAnimal(dolphin);
        zoo.addAquaticAnimal(penguin);
        zoo.addAquaticAnimal(dolphin2);

      zoo.afficher();
      x=zoo.searchAnimal(elephant);
      if (x==-1){System.out.println("animeau non trouvé");}
      else
          System.out.println("animeau trouvé");

        test =zoo.removeAnimal(fakroun);
        if (test==true) System.out.println("removed");
        else System.out.println("can't find it");

        test=zoo.isZooFull();
        if (test==true) System.out.println("zoo is full");
        else System.out.println("not full");



        System.out.println(dolphin);
        System.out.println(penguin);
        zoo.showAquaticSwim();
        System.out.println("Profondeur maximale des pinguins : " + zoo.getMaxPenguinDepth());

        System.out.println(dolphin.equals(dolphin2));
    }
}