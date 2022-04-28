package com.fish.file.fileImportExport.util;

import java.util.function.Function;

/**
 * @author Fish
 * @create 2022/4/28 9:05
 */

public interface FileFunction<InputStream, T> extends Function<java.io.InputStream, T> {
    @Override
    T apply(java.io.InputStream inputStream);
}
