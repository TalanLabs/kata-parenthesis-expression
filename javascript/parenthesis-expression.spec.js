import { checkParenthesis } from "./parenthesis-expression";

describe("checkParenthesis()", () => {
  test("expression 1", () =>
    expect(checkParenthesis("{([]){}()}")).toEqual(true));

  test("expression 2", () =>
    expect(checkParenthesis("{([{S}]]6K[()]}")).toEqual(false));

  test("expression 3", () =>
    expect(checkParenthesis("{C{}[{[a]}RqhL]{y2}}")).toEqual(true));

  test("expression 4", () =>
    expect(checkParenthesis("W12{}{}L{}")).toEqual(true));

  test("expression 5", () =>
    expect(checkParenthesis("h{Pn{GT{h}(c))}")).toEqual(true));

  test("expression 6", () =>
    expect(checkParenthesis("{[{iHTSc}]}p(R)m(){q({})")).toEqual(false));

  test("expression 7", () =>
    expect(checkParenthesis("{([]){}()}")).toEqual(true));

  test("expression 8", () => expect(checkParenthesis("][")).toEqual(false));

  test("expression 9", () => expect(checkParenthesis("{(})")).toEqual(false));
});
