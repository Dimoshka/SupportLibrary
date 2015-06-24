package com.syject.support.android.loaders;

/**
 * Created by maxim_000 on 07.11.2014.
 */
public interface IPaginationLoader {
    boolean isEnd();

    int getCount();
    void setCount(int count);

    void onContentChanged();
}
