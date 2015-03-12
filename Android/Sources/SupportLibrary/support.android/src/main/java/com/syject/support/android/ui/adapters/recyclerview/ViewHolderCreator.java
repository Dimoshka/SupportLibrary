package com.syject.support.android.ui.adapters.recyclerview;

/**
 * Created by maxim_000 on 26.01.2015.
 */
public abstract class ViewHolderCreator<VH extends ViewHolderBase<TItem>, TItem> implements IViewHolderCreator<VH, TItem> {

    @Override
    public int getDataType(TItem item) {
        return 0;
    }

}
