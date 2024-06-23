package com.lld.behavioral.chainofresponsibility;

public class ErrorLogProcessor extends LogProcessor{
    ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String msg) {
        if (logLevel == LogProcessor.ERROR) {
            System.out.println("ERROR: " + msg);
        } else {
            super.log(logLevel, msg);
        }
    }
}
