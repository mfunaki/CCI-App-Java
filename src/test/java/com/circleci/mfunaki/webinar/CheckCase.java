package com.circleci.mfunaki.webinar;

public class TestCase {
    private int param1;
    private int param2;
    private int expected;

    public CheckCase(int param1, int param2, int expected) {
        this.param1 = param1;
        this.param2 = param2;
        this.expected = expected;
    }

    public int getParam1() {
        return param1;
    }

    public int getParam2() {
        return param2;
    }

    public int getExpected() {
        return expected;
    }
}