package com.syject.support.android.ui.adapters.recyclerview;

import java.util.List;

/**
 * Created by maxim_000 on 26.01.2015.
 * Класс, реализующий интерфейс IDataSource. Используется для упрощения работы с коллекцией List.
 */
public class ListDataSource<TItem> implements IDataSource<TItem> {

    private final List<TItem> items;

    public ListDataSource(List<TItem> items) {
        this.items = items;
    }

    @Override
    public TItem getItem(int position) {
        return items.get(position);
    }

    @Override
    public int getCount() {
        return items.size();
    }

}
