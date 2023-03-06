package homework7.Task3;

import homework7.utils.ScannerUtils;

import java.util.Arrays;
import java.util.function.Predicate;

import static homework7.utils.ScannerUtils.readAlphabeticString;
import static homework7.utils.ScannerUtils.readLong;

public class Task3 {
    public static void main(String[] args) {
        Price[] prices = new Price[2];
        prices[0] = createPrice();
        System.out.println();
        prices[1] = createPrice();
        System.out.println();
        Arrays.sort(prices);

        String shopName = ScannerUtils.readAlphabeticString("Enter shop name for filtering prices: ");
        long count = Arrays.stream(prices)
                .filter(price -> price.getShopName().equals(shopName))
                .peek(System.out::println)
                .count();
        
        /*int count = 0;
        for (Price a : prices) {
            if (a.getShopName().equals(shopName)) {
                count++;
                System.out.println(a);
            }
        }*/
        if (count == 0) {
            System.out.println("No matches found for shopName '" + shopName + "'");
        }
    }

    public static Price createPrice() {
        Predicate<String> stringCondition = str -> str.length() <= 20;
        String productName = readAlphabeticString(
                "Enter productName: ", stringCondition, "String length must be less than 21 symbol"
        );
        String shopName = readAlphabeticString(
                "Enter shopName: ", stringCondition, "String length must be less than 21 symbol"
        );

        Predicate<Long> priceCondition = input -> input > 0;
        long price = readLong("Enter price: ", priceCondition);
        return new Price(productName, shopName, price);
    }
}
