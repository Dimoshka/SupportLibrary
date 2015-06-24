package com.syject.support.android.loaders;

import android.content.Context;

import java.io.Serializable;

/**
 * Created by maxim_000 on 14.11.2014.
 * Data source interface.
 */
public interface IDataSource<T> extends Serializable {
    ILoaderAlgorithm<T> createAlgorithm(Context context);
}
