package com.smstext.content;

import java.util.concurrent.atomic.AtomicInteger;

public class ViewId {

    private static ViewId INSTANCE = new ViewId();

    private AtomicInteger seq;

    public ViewId() {
        seq = new AtomicInteger(0);
    }

    public int getUniqueId() {
        return seq.incrementAndGet();
    }

    public static ViewId getInstance() {
        return INSTANCE;
    }
}
