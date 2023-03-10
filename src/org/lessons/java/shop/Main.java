package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        System.out.println(Product.getIva());
        Product spaghetti = new Product("Spaghetti");
        spaghetti.setPrice(1.20);
        spaghetti.setDescription("tempo di cottura 10min");

        System.out.println(spaghetti);
        System.out.println("Product name: " + spaghetti.getName() + ", price: " + spaghetti.getPrice() + ", final price: " + spaghetti.getFinalPrice() + ", code: " + spaghetti.getCode() + ", description: " + spaghetti.getDescription());
        System.out.println(spaghetti.getFullName());

        Product pomodori = new Product();
        pomodori.setName("Pomodori pachino");
        pomodori.setPrice(3.45);


        System.out.println("Product name: " + pomodori.getName() + ", price: " + pomodori.getFinalPrice() + ", code: " + pomodori.getCode());
    }
}
