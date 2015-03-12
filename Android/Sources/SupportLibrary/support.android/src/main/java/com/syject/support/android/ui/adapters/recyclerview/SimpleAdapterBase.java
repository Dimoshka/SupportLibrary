package com.syject.support.android.ui.adapters.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by maxim_000 on 26.01.2015.
 * Класс, расширяющий RecyclerView.Adapter. В большинстве ситуаций, стоть использовать класс-наследник SimpleAdapter.
 *
 * Используется как прослойка, которая, с одной стороны
 * упрощает работу с адаптером, а с другой, принуждает разделять код между разными объектами,
 * чтобы применять принцип единой ответственности.
 *
 * При наследовании этого класса, обязательно нужно в конструкторе вызывать метод setManager.
 */
public class SimpleAdapterBase<VH extends ViewHolderBase<TItem>, TItem> extends RecyclerView.Adapter<VH> {

    private IViewHolderManager<VH, TItem> manager;

    protected SimpleAdapterBase() {

    }

    /**
     * Этот метод нужно вызывать в конструкотре. Это обязательное требование.
     * @param manager
     */
    public void setManager(IViewHolderManager<VH, TItem> manager) {
        if(manager == null)
            throw new NullPointerException("manager");
        if(this.manager != null)
            throw new RuntimeException("You shouldn't call this method twice");
        this.manager = manager;
    }

    @Override
    public VH onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        checkManagerIsPresent();
        return manager.onCreateViewHolder(viewGroup, viewType);
    }

    @Override
    public void onBindViewHolder(VH viewHolder, int position) {
        manager.onBindViewHolder(viewHolder, position);
    }

    @Override
    public int getItemViewType(int position) {
        return manager.getItemViewType(position);
    }

    @Override
    public int getItemCount() {
        return manager.getItemCount();
    }

    private void checkManagerIsPresent() {
        if(manager == null)
            throw new RuntimeException("Call setManager(...) from your constructor");
    }

}
