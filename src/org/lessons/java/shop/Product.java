package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.Random;

public class Product {

    //Campi
    private final int code;
    private String name;
    private String description;
    private double price;
    private static final double IVA = 0.21;

    // Costruttori
    public Product() {
        Random rand = new Random();
        code = rand.nextInt(1, 10000000);
        name = "New product";
    }

    public Product(String name) {
        Random rand = new Random();
        code = rand.nextInt(1, 10000000);
        this.name = name;
    }

    // Getter e setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public static double getIva() {
        return IVA;
    }

    // Metodi

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public String getFinalPrice() {
        DecimalFormat decimalFormat = new DecimalFormat("##.00");
        return decimalFormat.format(price * (1 + IVA));
    }

    public String getFullName() {
        return name + "-" + code;
    }


    public String getFormattedCode() {
        String codeString = String.valueOf(code);
        while (codeString.length() < 8) {
            codeString = "0" + codeString;
        }
        return codeString;
    }

}
