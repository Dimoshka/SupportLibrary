package com.syject.support.android.loaders;

/**
 * Created by maxim_000 on 31.10.2014.
 */
public class LoaderResult<T> {

    public static <T> LoaderResult<T> create(T value) {
        return new LoaderResult<T>(value, null);
    }

    public static <T> LoaderResult<T> create(Exception error) {
        return new LoaderResult<T>(null, error);
    }

    public final T value;
    public final Exception error;

    private LoaderResult(T value, Exception error) {
        this.value = value;
        this.error = error;
    }

}
