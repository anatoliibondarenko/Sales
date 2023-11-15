package controllers;

import models.Product;
import utils.Rounder;
import views.SalesView;

// Controller
public class ProductController {

    Product model;
    SalesView view;

    // Конструктор
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        String name = model.getName();

        // 2) вызов методов расчетов доходов и налога;
        double income = model.calcIncome();
        double tax = model.calcTax();
        double netIncome = model.calcNetIncome();

        // 3) округление расчетных значений;
        income = Rounder.round(income);
        tax = Rounder.round(tax);
        netIncome = Rounder.round(netIncome);

        // 4) вывод расчетов по заданному формату.
        String output = "Product name: " + name + "\n" +
                "Total income (EUR): " + income + "\n" +
                "Tax amount (EUR): " + tax + "\n" +
                "Net Income (EUR): " + netIncome;

        view.getOutput(output);
    }
}
