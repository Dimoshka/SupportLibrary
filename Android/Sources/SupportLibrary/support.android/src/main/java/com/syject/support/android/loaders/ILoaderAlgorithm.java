package com.syject.support.android.loaders;

import java.util.List;

/**
 * Created by maxim_000 on 06.11.2014.
 */
public interface ILoaderAlgorithm<T> {

    List<T> loadItems(int offset, int count) throws Exception;
    boolean isPaginationSupported();

}
