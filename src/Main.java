public class Main {
    public static void main(String[] args) {

        DepartementHashSet gestion = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 20);
        Departement d2 = new Departement(2, "RH", 10);
        Departement d3 = new Departement(3, "Finance", 15);

        gestion.ajouterDepartement(d1);
        gestion.ajouterDepartement(d2);
        gestion.ajouterDepartement(d3);

        System.out.println("Liste des departements :");
        gestion.afficherDepartements();

        System.out.println("Recherche 'RH': " + gestion.rechercherDepartement("RH"));

        System.out.println("Tri par ID :");
        gestion.trierDepartementsParId();

        System.out.println("\nTri par Nom puis Nombre Employés :");
        gestion.trierDepartementsParNomEtNombreEmployes();
    }
}
