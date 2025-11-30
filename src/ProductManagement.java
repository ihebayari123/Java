import java.util.Comparator;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductManagement implements Management {

    @Override
    public void displayProducts(List<Product> products, Consumer<Product> con) {
        products.forEach(con);
    }

    @Override
    public void displayProductsByFilter(List<Product> products,
                                        Predicate<Product> pre,
                                        Consumer<Product> con) {
        products.stream()
                .filter(pre)
                .forEach(con);
    }

    @Override
    public String returnProductsNames(List<Product> products, Function<Product, String> fun) {
        return products.stream()
                .map(fun)
                .collect(Collectors.joining(", "));
    }

    @Override
    public Product createProduct(Supplier<Product> sup) {
        return sup.get();
    }

    @Override
    public List<Product> sortProductsById(List<Product> products, Comparator<Product> com) {
        return products.stream()
                .sorted(com)
                .collect(Collectors.toList());
    }

    @Override
    public Stream<Product> convertToStream(List<Product> products) {
        return products.stream();
    }
}
