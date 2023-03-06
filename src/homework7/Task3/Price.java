package homework7.Task3;

//Створіть проект за допомогою IntelliJ IDEA. Потрібно: Описати клас з іменем Price, що містить такі поля:
//  назву товару;
//  назву магазину, в якому продається товар;
//  вартість товару у гривнях.
// Написати програму, яка виконує такі дії:
//  введення з клавіатури даних до масиву, що складається з двох елементів типу Price
// (записи мають бути впорядковані в алфавітному порядку за назвами магазинів);
//  виведення на екран інформації про товари, що продаються в магазині,
// назва якого введена з клавіатури (якщо такого магазину немає, вивести виняток).
public class Price implements Comparable<Price> {
    private String productName;
    private String shopName;
    private double price;

    public Price(String productName, String shopName, double price) {
        this.price = price;
        this.shopName = shopName;
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public String getShopName() {
        return shopName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Price{" +
                "productName='" + productName + '\'' +
                ", shopName='" + shopName + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    // повертає 0 якщо мій об'єкт рівний об'єкту який приходить.
    // -1 якщо об'єкт менше ніж об'єкт який передали.
    // 1 - якщо об'єкт більше ніж об'єкт який передають
    public int compareTo(Price price) {
        return this.shopName.compareTo(price.shopName); }
}
