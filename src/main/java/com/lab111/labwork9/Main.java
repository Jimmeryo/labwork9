package com.lab111.labwork9;

import com.lab111.labwork9.api.AbstractDataAPI;
import com.lab111.labwork9.factory.*;
import com.lab111.labwork9.model.DataObject;

/**
 * Головний клас для демонстрації роботи шаблону Abstract Factory
 */
public class Main {
    /**
     * Метод для тестування конкретної реалізації API
     * @param factory фабрика для створення API
     * @param name назва API для виводу
     */
    private static void testAPI(AbstractDataFactory factory, String name) {
        System.out.println("\nТестування " + name + ":");

        AbstractDataAPI api = factory.createDataAPI();
        api.connect();

        DataObject testData = new DataObject("1", "Тестові дані");
        api.create(testData);
        api.read("1");
        api.update(testData);
        api.delete("1");

        api.disconnect();
    }

    /**
     * Головний метод програми
     * @param args аргументи командного рядка
     */
    public static void main(String[] args) {
        // Тестування роботи з базою даних
        testAPI(new DBDataFactory(), "API бази даних");

        // Тестування роботи з файлами
        testAPI(new FileDataFactory(), "API файлової системи");

        // Тестування роботи з веб-сервісами
        testAPI(new WebServiceDataFactory(), "API веб-сервісів");
    }
}