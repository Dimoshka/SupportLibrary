package com.syject.support.android.ui.adapters.recyclerview;

import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by maxim_000 on 26.01.2015.
 * Класс, расширяющий RecyclerView.ViewHolder, используется в SimpleAdapterBase
 */
public abstract class ViewHolderBase<TItem> extends RecyclerView.ViewHolder {

    private ViewHolderBase(View itemView) {
        super(itemView);
    }

    public ViewHolderBase(LayoutInflater layoutInflater, ViewGroup root, @LayoutRes int layoutResId) {
        this(layoutInflater.inflate(layoutResId, root, false));
    }

    private TItem item;

    public void bind(TItem item) {
        boolean isNewItem = this.item != item;
        if(isNewItem)
            this.item = item;
        this.updateData(item, isNewItem);
    }

    /**
     * В этом методе нужно инициализировать view и получит ссылки на все элементы упаравления
     */
    protected abstract void initView(View view);

    /**
     * В этом методе нужно обновить состояние view
     * @param item элемент данных из dataSource
     * @param isNewItem указывает, сменился ли экземпляр item-а с последнего вызова этого метода.
     *                  Если isNewItem == true нужно полностью обновить данные, отображаемые во view.
     */
    protected abstract void updateData(TItem item, boolean isNewItem);

}
