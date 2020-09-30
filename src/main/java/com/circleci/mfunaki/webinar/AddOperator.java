package com.circleci.mfunaki.webinar;

import com.google.errorprone.annotations.OverridingMethodsMustInvokeSuper;

public class AddOperator implements Operator {
    public int operate(int a, int b) {
        return a + b;
    }
}
