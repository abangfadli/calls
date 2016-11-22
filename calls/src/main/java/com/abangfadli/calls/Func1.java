package com.abangfadli.calls;

/**
 * Created by ahmadfadli on 11/22/16.
 */

public interface Func1<R, T> extends Func {
    R call(T t);
}
