package com.syject.support.android.ui.adapters.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maxim_000 on 26.01.2015.
 * Класс, расширяющий ViewHolderBase. Подходит для большинста случаев.
 */
public abstract class SimpleAdapter<VH extends ViewHolderBase<TItem>, TItem> extends SimpleAdapterBase<VH, TItem> {

    public final List<TItem> items;
    public final LayoutInflater layoutInflater;

    public SimpleAdapter(Context context) {
        items = new ArrayList<>();
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        IDataSource<TItem> dataSource = new ListDataSource<>(items);

        setManager(new ViewHolderManager<>(getViewHolderCreator(), dataSource));
    }

    public abstract IViewHolderCreator<VH, TItem> getViewHolderCreator();

}
