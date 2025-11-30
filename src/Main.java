public class Main {
    public static void main(String[] args) {

        ProductManagement pm = new ProductManagement();

        List<Product> produits = List.of(
                new Product(3, "Stylo", 1.2),
                new Product(1, "Cahier", 3.5),
                new Product(2, "Clé USB", 20.0)
        );

        // Affichage
        pm.displayProducts(produits, p -> System.out.println(p));

        // Filtre: prix > 2
        pm.displayProductsByFilter(produits,
                p -> p.getPrix() > 2,
                System.out::println);

        // Retourner les noms
        System.out.println(pm.returnProductsNames(produits, Product::getNom));

        // Créer un produit
        Product p = pm.createProduct(() -> new Product(10, "Souris", 15.0));
        System.out.println(p);

        // Trier par ID
        List<Product> sorted = pm.sortProductsById(produits, Comparator.comparing(Product::getId));
        sorted.forEach(System.out::println);
    }
}
