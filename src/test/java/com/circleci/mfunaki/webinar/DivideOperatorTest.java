package com.circleci.mfunaki.webinar;

import org.junit.Test;
import static org.junit.Assert.*;

public class DivideOperatorTest extends AbstractOperatorTest {
    public AddOperatorTest() {
        super(
            new CheckCase[] {
                new CheckCase(9, 3, 3),
                new CheckCase(8, 2, 4)
            },
            new DivideOperator()
        );
    }
}
