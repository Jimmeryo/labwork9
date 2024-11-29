package com.lab111.labwork9.factory;

import com.lab111.labwork9.api.AbstractDataAPI;
import com.lab111.labwork9.api.FileDataAPI;

/**
 * Конкретна фабрика для створення компонентів для роботи з файлами
 */
public class FileDataFactory extends AbstractDataFactory {

    /**
     * Створює новий екземпляр API для роботи з файлами
     * @return новий об'єкт FileDataAPI
     */
    @Override
    public AbstractDataAPI createDataAPI() {
        return new FileDataAPI();
    }
}