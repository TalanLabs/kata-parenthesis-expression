package com.talan.dojo;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;

public class ParenthesisExpressionTest {

    @Test
    @DisplayName("expression 1")
    void expression1() {
        Assertions.assertEquals(true, ParenthesisExpression.checkExpression("{([]){}()}"));
    }

    @Test
    @DisplayName("expression 2")
    void expression2() {
        Assertions.assertEquals(false, ParenthesisExpression.checkExpression("{([{S}]]6K[()]}"));
    }

    @Test
    @DisplayName("expression 3")
    void expression3() {
        Assertions.assertEquals(true, ParenthesisExpression.checkExpression("{C{}[{[a]}RqhL]{y2}}"));
    }


    @Test
    @DisplayName("expression 4")
    void expression4() {
        Assertions.assertEquals(true, ParenthesisExpression.checkExpression("W12{}{}L{}"));
    }

    @Test
    @DisplayName("expression 5")
    void expression5() {
        Assertions.assertEquals(false, ParenthesisExpression.checkExpression("h{Pn{GT{h}(c))}"));
    }


    @Test
    @DisplayName("expression 6")
    void expression6() {
        Assertions.assertEquals(false, ParenthesisExpression.checkExpression("{[{iHTSc}]}p(R)m(){q({})"));
    }


    @Test
    @DisplayName("expression 7")
    void expression7() {
        Assertions.assertEquals(false, ParenthesisExpression.checkExpression("]["));
    }

    @Test
    @DisplayName("expression 8")
    void expression8() {
        Assertions.assertEquals(false, ParenthesisExpression.checkExpression("{(})"));
    }




}
