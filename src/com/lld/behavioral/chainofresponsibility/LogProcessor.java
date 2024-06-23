package com.lld.behavioral.chainofresponsibility;

import java.util.Objects;

public abstract class LogProcessor {
    public final static int INFO = 1;
    public final static int DEBUG = 2;
    public final static int ERROR = 3;
    private final LogProcessor nextLogProcessor;

     LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(int logLevel, String msg) {
         if (Objects.nonNull(nextLogProcessor)) {
             nextLogProcessor.log(logLevel,msg);
         }
    }
}
