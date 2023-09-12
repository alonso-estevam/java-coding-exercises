package externalchallenges.nelioalves.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* Make a program to read a set of products from a .csv file (suppose
  there is at least one product). Show the average price of the
  products. Then show the names in descending order of the products
  that have a price lower than the average price.
  (Section 20, lesson 261 from Java POO Udemy course by Nelio Alves  */
public class StreamsChallenge {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Tv", 900.00));
        products.add(new Product("Mouse", 50.00));
        products.add(new Product("Tablet", 350.50));
        products.add(new Product("HD Case", 80.90));
        products.add(new Product("Computer", 850.00));
        products.add(new Product("Monitor", 290.00));

        double averagePrice = getAveragePrice(products);
        System.out.printf("The average price is $%.2f%n------%n", averagePrice);

        // filter the products with price lower than average price
        // sort the names of the products by descending order ( using .reversed() )
        // print the names using forEach()
        products.stream()
                .filter(p -> p.getPrice() < averagePrice)
                .sorted(Comparator.comparing(Product::getName).reversed())
                .forEach(p -> System.out.println(p.getName()));
    }

    // average price: reduce to get the sum of the prices and then divide by size of the list
    private static double getAveragePrice(List<Product> products){
        double sum = products.stream()
                .map(Product::getPrice)
                .reduce(0.0, (n1, n2) -> n1 + n2);
        return sum / products.size();
    }
}
