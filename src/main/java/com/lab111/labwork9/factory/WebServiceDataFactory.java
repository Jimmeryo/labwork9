package com.lab111.labwork9.factory;

import com.lab111.labwork9.api.AbstractDataAPI;
import com.lab111.labwork9.api.WebServiceDataAPI;

/**
 * Конкретна фабрика для створення компонентів для роботи з веб-сервісами
 */
public class WebServiceDataFactory extends AbstractDataFactory {

    /**
     * Створює новий екземпляр API для роботи з веб-сервісами
     * @return новий об'єкт WebServiceDataAPI
     */
    @Override
    public AbstractDataAPI createDataAPI() {
        return new WebServiceDataAPI();
    }
}