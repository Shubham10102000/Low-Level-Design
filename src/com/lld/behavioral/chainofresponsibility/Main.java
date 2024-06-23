package com.lld.behavioral.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        // chain
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.ERROR, "Exception happened");
        logProcessor.log(LogProcessor.DEBUG, "Let's Debug this");
        logProcessor.log(LogProcessor.INFO, "For your information");
    }
}
