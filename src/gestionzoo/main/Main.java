package gestionzoo.main;

public class Main {
    public static void main(String[] args) {
        int x;
        boolean test;
Zoo zoo=new Zoo("belvidere","Tunis",2);
Animal lion=new Animal("fefef","Lion",3,true);
Animal fakroun=new Animal("ededf","fakroun",7,false);
Animal elephant = new Animal("Elephant", "Elephant", 10, true);


        System.out.println("Add Lion: " + zoo.addAnimal(lion));
        System.out.println("Add Fakroun: " + zoo.addAnimal(fakroun));
        System.out.println("Add Elephant: " + zoo.addAnimal(elephant));

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


    }
}