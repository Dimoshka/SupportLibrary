package com.syject.support.android.loaders;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

/**
 * Created by maxim_000 on 31.10.2014.
 */
public abstract class AsyncTaskLoaderBase<T> extends AsyncTaskLoader<com.syject.support.android.loaders.LoaderResult<T>> {

    public AsyncTaskLoaderBase(Context context) {
        super(context);
    }

}
