public interface Igestion<T> {
    void ajouterEmploye(T t);
    boolean rechercherEmploye(String nom);
    boolean rechercherEmploye(T t);
    boolean supprimerEmploye(T t);
    void trierEmployeParId();  // Comparable
    void trierEmployeParNomDépartementEtGrade(); // Comparator
    void displayEmploye();
}
