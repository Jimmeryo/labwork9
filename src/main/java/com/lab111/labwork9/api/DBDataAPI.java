package com.lab111.labwork9.api;

import com.lab111.labwork9.model.DataObject;

/**
 * Реалізація API для роботи з базою даних
 */
public class DBDataAPI implements AbstractDataAPI {

    @Override
    public void connect() {
        System.out.println("DBDataAPI: Встановлення з'єднання з базою даних");
    }

    @Override
    public void disconnect() {
        System.out.println("DBDataAPI: Закриття з'єднання з базою даних");
    }

    @Override
    public void create(DataObject data) {
        System.out.println("DBDataAPI: Створення запису в БД: " + data);
    }

    @Override
    public DataObject read(String id) {
        System.out.println("DBDataAPI: Читання запису з БД з id: " + id);
        return new DataObject(id, "Дані з БД");
    }

    @Override
    public void update(DataObject data) {
        System.out.println("DBDataAPI: Оновлення запису в БД: " + data);
    }

    @Override
    public void delete(String id) {
        System.out.println("DBDataAPI: Видалення запису з БД з id: " + id);
    }
}