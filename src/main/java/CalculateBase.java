public abstract class CalculateBase {
    private double leftValue;
    private double rightValue;
    private double result;

    public CalculateBase() {
    }

    public CalculateBase(double leftValue, double rightValue) {
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }

    public void setLeftValue(double leftValue) {
        this.leftValue = leftValue;
    }

    public void setRightValue(double rightValue) {
        this.rightValue = rightValue;
    }

    protected double getLeftValue() {
        return leftValue;
    }

    protected double getRightValue() {
        return rightValue;
    }

    public double getResult() {
        return result;
    }

    protected void setResult(double result) {
        this.result = result;
    }

    public abstract void calculate();
}
