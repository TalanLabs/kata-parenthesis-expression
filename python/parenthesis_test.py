import unittest

from parenthesis import (
    check_parenthesis
)


class CheckParenthesisTest(unittest.TestCase):

    def test_expression_1(self):
        self.assertEqual(check_parenthesis("{([]){}()}"), True)

    def test_expression_2(self):
        self.assertEqual(check_parenthesis("{([{S}]]6K[()]}"), False)

    def test_expression_3(self):
        self.assertEqual(check_parenthesis("{C{}[{[a]}RqhL]{y2}}"), True)

    def test_expression_4(self):
        self.assertEqual(check_parenthesis("W12{}{}L{}"), True)

    def test_expression_5(self):
        self.assertEqual(check_parenthesis("h{Pn{GT{h}(c))}"), False)

    def test_expression_6(self):
        self.assertEqual(check_parenthesis("{[{iHTSc}]}p(R)m(){q({})"), False)

    def test_expression_7(self):
        self.assertEqual(check_parenthesis("]["), False)

    def test_expression_8(self):
        self.assertEqual(check_parenthesis("{(})"), False)


