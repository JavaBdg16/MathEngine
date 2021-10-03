public class Multiplier extends CalculateBase implements MathProcessing {
    public Multiplier(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    public Multiplier() {
    }

    @Override
    public void calculate() {
        double value = getLeftValue() * getRightValue();
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
        return OperationCode.MULTIPLY;
    }
}
