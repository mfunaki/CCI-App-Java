package com.circleci.mfunaki.webinar;

import org.junit.Test;
import static org.junit.Assert.*;

public abstract class AbstractOperatorTest {
    protected TestCase[] testCases;
    protected Operator operator;
    
    public AbstractOperatorTest(TestCase[] testCases, Operator operator) {
        this.testCases = testCases;
        this.operator = operator;
    }

    @Test public void testOperator() {
        for (int i = 0; i < testCases.length; i++) {
            TestCase testCase = testCases[i];
            assertEquals(
                operator.operate(
                    testCase.getParam1(),
                    testCase.getParam2()),
                testCase.getExpected());
        }
    }
}