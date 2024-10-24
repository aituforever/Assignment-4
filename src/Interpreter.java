public class Interpreter {
    public int interpret(String expression) {
        String[] tokens = expression.split(" ");
        Expression result = new NumberExpression(Integer.parseInt(tokens[0]));

        for (int i = 1; i < tokens.length; i += 2) {
            char operator = tokens[i].charAt(0);
            int number = Integer.parseInt(tokens[i + 1]);
            result = new OperationExpression(result, new NumberExpression(number), operator);
        }
        return result.interpret();
    }
}
