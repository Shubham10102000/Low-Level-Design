package com.lld.behavioral.chainofresponsibility;

public class InfoLogProcessor extends LogProcessor{
    InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String msg) {
        if (logLevel == LogProcessor.INFO) {
            System.out.println("INFO: " + msg);
        } else {
            super.log(logLevel, msg);
        }
    }
}
