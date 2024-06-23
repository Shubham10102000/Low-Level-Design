package com.lld.behavioral.chainofresponsibility;

public class DebugLogProcessor extends LogProcessor{

    DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String msg) {
        if (logLevel == LogProcessor.DEBUG) {
            System.out.println("DEBUG: " + msg);
        } else {
            super.log(logLevel, msg);
        }
    }
}
