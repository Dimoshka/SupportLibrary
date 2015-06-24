package com.syject.support.android.ui.adapters.recyclerview;

/**
 * Created by maxim_000 on 26.01.2015.
 * Описывает методы для предоставляющие данные адаптеру.
 */
public interface IDataSource<TItem> {

    /**
     * Получить значение по позиции
     */
    TItem getItem(int position);

    /**
     * Вернуть кол-во элементов
     */
    int getCount();

}
