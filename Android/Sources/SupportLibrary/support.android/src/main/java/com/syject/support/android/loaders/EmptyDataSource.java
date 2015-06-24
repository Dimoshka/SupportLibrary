package com.syject.support.android.loaders;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maxim_000 on 18.12.2014.
 */
public class EmptyDataSource<T> implements IDataSource<T> {

    @Override
    public ILoaderAlgorithm<T> createAlgorithm(Context context) {
        return new Algorithm<>();
    }

    private static class Algorithm<T> implements ILoaderAlgorithm<T> {
        @Override
        public List<T> loadItems(int offset, int count) throws Exception {
            return new ArrayList<>();
        }

        @Override
        public boolean isPaginationSupported() {
            return false;
        }
    }

}
