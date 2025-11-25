import java.util.*;
public class Main {

    public static void main(String[] args) {

        AffectationHashMap gestion = new AffectationHashMap();

        Employe e1 = new Employe(1, "Ali");
        Employe e2 = new Employe(2, "Sami");
        Employe e3 = new Employe(3, "Mouna");

        Departement d1 = new Departement(10, "RH");
        Departement d2 = new Departement(20, "Finance");
        Departement d3 = new Departement(30, "IT");

        // Ajout
        gestion.ajouterEmployeDepartement(e1, d1);
        gestion.ajouterEmployeDepartement(e2, d2);
        gestion.ajouterEmployeDepartement(e3, d3);

        System.out.println(" Affectations");
        gestion.afficherEmployesEtDepartements();


        System.out.println("Tentative d'ajout double");
        gestion.ajouterEmployeDepartement(e1, d3);


        System.out.println("Suppression employé");
        gestion.supprimerEmploye(e2);
        gestion.afficherEmployesEtDepartements();


        System.out.println("Tri TreeMap");
        TreeMap<Employe, Departement> trie = gestion.trierMap();
        for (var entry : trie.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
