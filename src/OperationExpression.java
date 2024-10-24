public class OperationExpression implements Expression{
    private Expression left;
    private Expression right;
    private char operator;

    public OperationExpression(Expression left, Expression right, char operator){
        this.left = left;
        this.right = right;
        this.operator = operator;
    }
    @Override
    public int interpret() {
        if(operator == '+'){
            return left.interpret() + right.interpret();
        } else if(operator == '-'){
            return left.interpret() - right.interpret();
        } else {
            throw new Error("Invalid operator");
        }
    }
}
