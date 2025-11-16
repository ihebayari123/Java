import java.util.*;

public class DepartementHashSet implements IDepartement<Departement> {

    private HashSet<Departement> departements;

    public DepartementHashSet() {
        this.departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement d) {
        departements.add(d);
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        for (Departement d : departements) {
            if (d.getNomDep().equalsIgnoreCase(nomDepartement)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        departements.remove(d);
    }

    @Override
    public void afficherDepartements() {
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    @Override
    public void trierDepartementsParId() {
        List<Departement> list = new ArrayList<>(departements);
        list.sort(Comparator.comparingInt(Departement::getId));
        list.forEach(System.out::println);
    }

    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        List<Departement> list = new ArrayList<>(departements);
        list.sort(Comparator
                .comparing(Departement::getNomDep)
                .thenComparing(Departement::getNbEmp)
        );
        list.forEach(System.out::println);
    }
}
