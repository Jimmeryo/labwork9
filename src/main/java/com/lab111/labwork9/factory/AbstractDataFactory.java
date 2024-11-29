package com.lab111.labwork9.factory;

import com.lab111.labwork9.api.AbstractDataAPI;

/**
 * Абстрактна фабрика, що визначає інтерфейс для створення об'єктів API
 */
public abstract class AbstractDataFactory {

    /**
     * Створює конкретну реалізацію API для роботи з даними
     * @return об'єкт, що реалізує AbstractDataAPI
     */
    public abstract AbstractDataAPI createDataAPI();
}