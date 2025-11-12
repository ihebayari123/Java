public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        // Ajouter des employés
        Employe e1 = new Employe(3, "Ayari", "Iheb", "Informatique", 2);
        Employe e2 = new Employe(1, "BenAli", "Ahmed", "RH", 1);
        Employe e3 = new Employe(2, "Trabelsi", "Sami", "Informatique", 3);
        Employe e4 = new Employe(4, "Gharbi", "Nour", "Comptabilité", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);

        System.out.println("---- Liste initiale ----");
        societe.displayEmploye();

        System.out.println("\n---- Tri par ID ----");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\n---- Tri par Département, Grade, Nom ----");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        System.out.println("\n---- Recherche par Département (Informatique) ----");
        for (Employe e : societe.rechercherParDepartement("Informatique")) {
            System.out.println(e);
        }

        System.out.println("\n---- Suppression d’un employé ----");
        societe.supprimerEmploye(e2);
        societe.displayEmploye();
    }
}
