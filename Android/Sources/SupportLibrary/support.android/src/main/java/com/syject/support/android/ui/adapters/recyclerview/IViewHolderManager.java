package com.syject.support.android.ui.adapters.recyclerview;

import android.view.ViewGroup;

/**
 * Created by maxim_000 on 26.01.2015.
 * Воспомогательный интерфейс, который использует класс SimpleAdapterBase,
 * определяет методы, которые нужно реализовать в адаптере.
 */
public interface IViewHolderManager<VH extends ViewHolderBase<TItem>, TItem> {
    VH onCreateViewHolder(ViewGroup viewGroup, int viewType);
    void onBindViewHolder(VH viewHolder, int position);
    int getItemViewType(int position);
    int getItemCount();
}
