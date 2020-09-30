package com.circleci.mfunaki.webinar;

import org.junit.Test;
import static org.junit.Assert.*;

public class AddOperatorTest extends AbstractOperatorTest {
    public AddOperatorTest() {
        super(
            new TestCase[] {
                new TestCase(1, 2, 3),
                new TestCase(2, 1, 3)
            },
            new AddOperator()
        );
    }
}
