package com.abangfadli.calls;

/**
 * Created by ahmadfadli on 11/22/16.
 */

public interface Func4<R, T1, T2, T3, T4> extends Func {
    R call(T1 t1, T2 t2, T3 t3, T4 t4);
}
