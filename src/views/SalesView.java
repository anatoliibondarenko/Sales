package views;


import models.Product;
import utils.Validator;

import java.util.Scanner;

// View
public class SalesView {

    Product model;
    String title;
    String name;
    int quantity;
    double price;
    Scanner scanner;

    // Здесь, создайте конструктор данного класса,
    // который в параметре содержит переменную типа модели.
    public SalesView(Product model) {
        this.model = model;
    }

    public void getInputs() {

        scanner = new Scanner(System.in);

        title = "Input product name: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        name = Validator.validateName(scanner);
        model.setName(name);

        title = "Input quantity: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        quantity = Validator.validateQuantityInput(scanner);
        model.setQuantity(quantity);

        title = "Input price: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        price = Validator.validatePriceInput(scanner);
        model.setPrice(price);

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
