public class DynamicHelper {

    private final MathProcessing[] handlers;

    public DynamicHelper(MathProcessing[] handlers) {
        this.handlers = handlers;
    }

    public void process(String statement) throws InvalidStatementException {
        // add 2 2
        String[] parts = statement.split(MathProcessing.SEPARATOR);
        if (parts.length != 3) {
//            InvalidStatementException invalidStatementException =
//                    new InvalidStatementException("Statement must have 3 parts: operation leftValue rightValue");

            throw new InvalidStatementException(
                    "Statement must have 3 parts: operation leftValue rightValue");
        }

        String operation = parts[0];
        double leftValue = Double.parseDouble(parts[1]);
        double rightValue = Double.parseDouble(parts[2]);

        MathProcessing theHandler = null;
        for (MathProcessing handler : handlers) {
            if (operation.equalsIgnoreCase(handler.getOperationCode().toString())) {
                theHandler = handler;
                break;
            }
        }

        if (theHandler == null) {
            System.out.println("Unknown operation");
        } else {
            double result = theHandler.doCalculation(leftValue, rightValue);
            System.out.println("result = " + result);
        }
    }
}
