package lab6.Operation;

public class Operation {
    enum Type {
        ADD, SUB, UNSPECIFIED
    }

    private Type typeLastOperation;

    public String getBasicOperation(String op) {

        if (op.equalsIgnoreCase("+")) {

            class Add implements BasicOperation {
                @Override
                public String printOperation() {
                    Operation.this.typeLastOperation = Type.ADD;
                    return "ADUNARE";
                }
            }

            Add add = new Add();
            return add.printOperation();

        } else if (op.equalsIgnoreCase("-")) {
            class Sub implements BasicOperation {
                @Override
                public String printOperation() {
                    Operation.this.typeLastOperation = Type.SUB;
                    return "SCADERE";
                }
            }

            return (new Sub()).printOperation();
        }

        Operation.this.typeLastOperation = Type.UNSPECIFIED;
        return null;
    }

    public Type getTypeLastOperation() {
        return typeLastOperation;
    }
}
