public class Adder extends CalculateBase implements MathProcessing {
    public Adder(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    public Adder() {
    }

    @Override
    public void calculate() {
        double value = getLeftValue() + getRightValue();
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
        return OperationCode.ADD;
    }
}
