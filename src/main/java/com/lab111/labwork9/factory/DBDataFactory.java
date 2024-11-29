package com.lab111.labwork9.factory;

import com.lab111.labwork9.api.AbstractDataAPI;
import com.lab111.labwork9.api.DBDataAPI;

/**
 * Конкретна фабрика для створення компонентів для роботи з базою даних
 */
public class DBDataFactory extends AbstractDataFactory {

    /**
     * Створює новий екземпляр API для роботи з базою даних
     * @return новий об'єкт DBDataAPI
     */
    @Override
    public AbstractDataAPI createDataAPI() {
        return new DBDataAPI();
    }
}