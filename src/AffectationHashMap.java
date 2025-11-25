import java.util.*;

public class AffectationHashMap {

    private HashMap<Employe, Departement> map = new HashMap<>();

    // 2. Ajouter une affectation
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        if (map.containsKey(e)) {
            System.out.println("⚠ L'employé est déjà affecté à un département !");
        } else {
            map.put(e, d);
        }
    }

    // 3a. Affichage des couples
    public void afficherEmployesEtDepartements() {
        if (map.isEmpty()) {
            System.out.println("Aucune affectation.");
            return;
        }
        for (Map.Entry<Employe, Departement> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    // 4. Supprimer un employé (toute l'affectation)
    public void supprimerEmploye(Employe e) {
        map.remove(e);
    }

    // 5. Supprimer une affectation spécifique
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (map.containsKey(e) && map.get(e).equals(d)) {
            map.remove(e);
        }
    }

    // 6. Affichage des employés
    public void afficherEmployes() {
        for (Employe e : map.keySet()) {
            System.out.println(e);
        }
    }

    // 7. Affichage des départements
    public void afficherDepartements() {
        for (Departement d : new HashSet<>(map.values())) {
            System.out.println(d);
        }
    }

    // 8. Recherche employé
    public boolean rechercherEmploye(Employe e) {
        return map.containsKey(e);
    }

    // 9. Recherche département
    public boolean rechercherDepartement(Departement d) {
        return map.containsValue(d);
    }

    // 10. Tri avec TreeMap
    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>(map);
    }
}
