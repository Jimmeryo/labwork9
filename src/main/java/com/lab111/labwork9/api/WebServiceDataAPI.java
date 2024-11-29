package com.lab111.labwork9.api;

import com.lab111.labwork9.model.DataObject;

/**
 * Реалізація API для роботи з веб-сервісами
 */
public class WebServiceDataAPI implements AbstractDataAPI {

    @Override
    public void connect() {
        System.out.println("WebServiceDataAPI: Встановлення з'єднання з веб-сервісом");
    }

    @Override
    public void disconnect() {
        System.out.println("WebServiceDataAPI: Закриття з'єднання з веб-сервісом");
    }

    @Override
    public void create(DataObject data) {
        System.out.println("WebServiceDataAPI: Відправка POST запиту з даними: " + data);
    }

    @Override
    public DataObject read(String id) {
        System.out.println("WebServiceDataAPI: Відправка GET запиту для id: " + id);
        return new DataObject(id, "Дані з веб-сервісу");
    }

    @Override
    public void update(DataObject data) {
        System.out.println("WebServiceDataAPI: Відправка PUT запиту з даними: " + data);
    }

    @Override
    public void delete(String id) {
        System.out.println("WebServiceDataAPI: Відправка DELETE запиту для id: " + id);
    }
}