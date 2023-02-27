package AssociativeArrays;

import java.util.*;

public class E03_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<Double>> productsMap = new LinkedHashMap<>();

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("buy")){
            String name = inputLine.split(" ")[0];
            double price = Double.parseDouble(inputLine.split(" ")[1]);
            double quantity = Double.parseDouble(inputLine.split(" ")[2]);
            List<Double> productInfo = new ArrayList<>();
            productInfo.add(price);
            productInfo.add(quantity);

            if (!productsMap.containsKey(name))
                productsMap.put(name, productInfo);
            else {
                double oldQuantity = productsMap.get(name).get(1);
                productInfo.set(0, price);
                productInfo.set(1, oldQuantity + quantity);
                productsMap.put(name,productInfo);
            }
            inputLine = scanner.nextLine();
        }
        for (Map.Entry<String, List<Double>> entry: productsMap.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue().get(0) * entry.getValue().get(1));
        }
    }
}
