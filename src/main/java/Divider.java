public class Divider extends CalculateBase implements MathProcessing {
    public Divider(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    public Divider() {
    }

    @Override
    public void calculate() {

        // dla double dzielenie przez 0 działa i zwraca wartość Infinity
        // wymuszamy wystąpienie wyjątku ArithmeticException
        if (getRightValue() == 0.0d) {
            setResult(0/0);
        }
        double value = getLeftValue() / getRightValue();
        setResult(value);
    }

    @Override
    public double doCalculation(double leftValue, double rightValue) {
        setLeftValue(leftValue);
        setRightValue(rightValue);
        calculate();
        return getResult();
    }

    @Override
    public OperationCode getOperationCode() {
        return OperationCode.DIVIDE;
    }
}
