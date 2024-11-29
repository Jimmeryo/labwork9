package com.lab111.labwork9.api;

import com.lab111.labwork9.model.DataObject;

/**
 * Реалізація API для роботи з файловою системою
 */
public class FileDataAPI implements AbstractDataAPI {

    @Override
    public void connect() {
        System.out.println("FileDataAPI: Ініціалізація роботи з файловою системою");
    }

    @Override
    public void disconnect() {
        System.out.println("FileDataAPI: Завершення роботи з файловою системою");
    }

    @Override
    public void create(DataObject data) {
        System.out.println("FileDataAPI: Створення файлу з даними: " + data);
    }

    @Override
    public DataObject read(String id) {
        System.out.println("FileDataAPI: Читання даних з файлу: " + id);
        return new DataObject(id, "Дані з файлу");
    }

    @Override
    public void update(DataObject data) {
        System.out.println("FileDataAPI: Оновлення даних у файлі: " + data);
    }

    @Override
    public void delete(String id) {
        System.out.println("FileDataAPI: Видалення файлу: " + id);
    }
}