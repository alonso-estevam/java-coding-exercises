package externalchallenges.nelioalves.streams;

import java.io.*;
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

        String filePath = "C://temp//input.csv"; // I couldn't get the relative path :(

        List<Product> products = getProductList(filePath);

        double averagePrice = getAveragePrice(products);
        System.out.printf("The average price is $%.2f%n------%n", averagePrice);

        printProductsNameByDescendingOrder(products, averagePrice);

    }

    // average price: reduce to get the sum of the prices and then divide by size of the list
    private static double getAveragePrice(List<Product> products){
        double sum = products.stream()
                .map(Product::getPrice)
                .reduce(0.0, Double::sum);
        return sum / products.size();
    }

    /*  filter the products with price lower than average price
        sort the names of the products by descending order ( using .reversed() )
        print the names using forEach()  */
    private static void printProductsNameByDescendingOrder(List<Product> products, double averagePrice){
        products.stream()
                .filter(p -> p.getPrice() < averagePrice)
                .sorted(Comparator.comparing(Product::getName).reversed())
                .forEach(p -> System.out.println(p.getName()));
    }

    private static List<Product> getProductList(String filePath) {
        List<Product> products = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String currentLine = reader.readLine();
            while(currentLine != null){
                String[] fields = currentLine.split(",");
                products.add(new Product(fields[0], Double.parseDouble(fields[1])));
                currentLine = reader.readLine();
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return products;

    }
}
