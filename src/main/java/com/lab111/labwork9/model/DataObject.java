package com.lab111.labwork9.model;

/**
 * Базовий клас для об'єктів даних, що будуть оброблятися через різні API
 */
public class DataObject {
    private String id;
    private String data;

    /**
     * Конструктор за замовчуванням
     */
    public DataObject() {
        this.id = "";
        this.data = "";
    }

    /**
     * Конструктор з параметрами
     * @param id унікальний ідентифікатор об'єкту даних
     * @param data вміст об'єкту даних
     */
    public DataObject(String id, String data) {
        this.id = id;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataObject{" +
                "id='" + id + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}