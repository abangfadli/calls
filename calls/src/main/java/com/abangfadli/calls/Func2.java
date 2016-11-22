package com.abangfadli.calls;

/**
 * Created by ahmadfadli on 11/22/16.
 */

public interface Func2<R, T1, T2> extends Func {
    R call(T1 t1, T2 t2);
}
