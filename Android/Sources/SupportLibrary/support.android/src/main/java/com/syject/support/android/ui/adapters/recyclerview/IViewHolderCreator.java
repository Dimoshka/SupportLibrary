package com.syject.support.android.ui.adapters.recyclerview;

import android.view.ViewGroup;

/**
 * Created by maxim_000 on 26.01.2015.
 * Описывает методы, создающие ViewHolder по требованию адаптера
 *
 * Можно использовать класс ViewHolderCreator, реализующий этот интерфейс
 */
public interface IViewHolderCreator<VH extends ViewHolderBase<TItem>, TItem> {

    /**
     * Создать экземпляр ViewHolder-а
     * @param root Родительский элемент управления, который нужно передавать в LayoutInflater
     * @param viewType Используется, если адаптер должен отображать несколько типов разметки.
     */
    VH createViewHolder(ViewGroup root, int viewType);

    /**
     * Этот метод используется, если адаптер должен отображать несколько типов разметки.
     * @param item элемент данных из dataSource
     * @return viewType (0 по умолчанию)
     */
    int getDataType(TItem item);

}
