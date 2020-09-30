package com.circleci.mfunaki.webinar;

import org.junit.Test;
import static org.junit.Assert.*;

public abstract class AbstractOperatorTest {
    protected CheckCase[] checkCases;
    protected Operator operator;
    
    public AbstractOperatorTest(CheckCase[] checkCases, Operator operator) {
        this.checkCases = checkCases;
        this.operator = operator;
    }

    @Test public void testOperator() {
        for (int i = 0; i < checkCases.length; i++) {
            CheckCase checkCase = checkCases[i];
            assertEquals(
                operator.operate(
                    checkCase.getParam1(),
                    checkCase.getParam2()),
                checkCase.getExpected());
        }
    }
}