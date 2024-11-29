package com.lab111.labwork9.api;

import com.lab111.labwork9.model.DataObject;

/**
 * Інтерфейс, що визначає основні операції для роботи з даними через різні API
 */
public interface AbstractDataAPI {
    /**
     * Встановлює з'єднання з джерелом даних
     */
    void connect();

    /**
     * Закриває з'єднання з джерелом даних
     */
    void disconnect();

    /**
     * Створює новий об'єкт даних
     * @param data об'єкт даних для створення
     */
    void create(DataObject data);

    /**
     * Читає об'єкт даних за ідентифікатором
     * @param id ідентифікатор об'єкта
     * @return знайдений об'єкт даних
     */
    DataObject read(String id);

    /**
     * Оновлює існуючий об'єкт даних
     * @param data об'єкт з оновленими даними
     */
    void update(DataObject data);

    /**
     * Видаляє об'єкт даних за ідентифікатором
     * @param id ідентифікатор об'єкта для видалення
     */
    void delete(String id);
}