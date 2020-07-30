package com.github.hcsp.multithread;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    AtomicInteger value = new AtomicInteger(0);

    public int getValue() {
        return value.intValue();
    }

    // 加上一个整数i，并返回加之后的结果
    public int addAndGet(int i) {
        value.getAndAdd(i);
        return value.intValue();
    }

    // 减去一个整数i，并返回减之后的结果
    public int minusAndGet(int i) {
        value.getAndAdd(-i);
        return value.intValue();
    }
}
