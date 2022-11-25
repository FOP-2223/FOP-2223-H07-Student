package h07.doubleoperators;

import java.util.function.DoubleBinaryOperator;

import static org.tudalgo.algoutils.student.Student.crash;

/**
 * Class implementing the interface DoubleBinaryOperator, such that
 * the overwritten method applyAsDouble first applies two operators
 * to the given parameters and returns the application of a third
 * operator to the intermediate results.
 */
public class ComposedDoubleBinaryOperator implements DoubleBinaryOperator {

    /**
     * First operator.
     */
    private final DoubleBinaryOperator op1;

    /**
     * Second operator.
     */
    private final DoubleBinaryOperator op2;

    /**
     * Third operator.
     */
    private final DoubleBinaryOperator op3;

    /**
     * Constructor initializes the three operators.
     *
     * @param op1   First operator.
     * @param op2   Second operator.
     * @param op3   Third operator.
     */
    public ComposedDoubleBinaryOperator(DoubleBinaryOperator op1, DoubleBinaryOperator op2, DoubleBinaryOperator op3) {
        // Assign first parameter to first operator
        this.op1 = op1;

        // Assign second parameter to second operator
        this.op2 = op2;

        // Assign third parameter to third operator
        this.op3 = op3;
    }

    /**
     * First applies the first and the second operator to the given parameters.
     * Then applies the third operator to the result of the application of the
     * first two operators.
     *
     * @param left      The first parameter.
     * @param right     The second parameter.
     * @return          Application of the third operator on the results of the
     *                  first and second operator.
     */
    @Override
    public double applyAsDouble(double left, double right) {
        return crash(); // TODO: H2.4 - remove if implemented
    }

}