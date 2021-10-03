public class Main {

    public static void main(String[] args) {

        MathEquation[] mathEquations = new MathEquation[4];

        mathEquations[0] = create(100.0d, 50.0d, OperationCode.DIVIDE);
        mathEquations[1] = create(25.0d, 92.0d, OperationCode.ADD);
        mathEquations[2] = create(225.0d, 25.0d, OperationCode.SUBSTRACT);
        mathEquations[3] = create(11.0, 4.0d, OperationCode.MULTIPLY);

        for (MathEquation mathEquation : mathEquations) {
            mathEquation.execute();
            System.out.println("result = " + mathEquation.getResult());
        }
    }

    private static MathEquation create(double leftValue, double rightValue, OperationCode operationCode) {
        MathEquation mathEquation = new MathEquation();
        mathEquation.setLeftValue(leftValue);
        mathEquation.setRightValue(rightValue);
        mathEquation.setOperationCode(operationCode);
        return mathEquation;
    }
}
