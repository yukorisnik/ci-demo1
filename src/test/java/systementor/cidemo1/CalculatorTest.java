package systementor.cidemo1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    private static final Logger logger = Logger.getLogger(CalculatorTest.class.getName());

    private final int a = 1;
    private final int b = 2;



    private final int devideA = 4;
    private final int devideB = 2;


    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }



    @Test
    void githubDemo() {
        int result = calculator.add(a,b);
        assertEquals(3,result);

    }





    @Test
    void divideWithLogging() {

        logger.info("divide " + devideA + " with " + devideB);

        if (b == 0){
            logger.severe("divide by zero!!");
            throw new IllegalArgumentException("divide by zero");
        }

        int result = devideA / devideB;
        assertEquals(2,result);

    }




    @Test
    void add() {
        int result = calculator.add(a,b);
        assertEquals(3,result);

    }

    @Test
    void subtract() {
        int result = calculator.subtract(a,b);
        assertEquals(-1,result);
    }

    @Test
    void multiply() {
        int result = calculator.multiply(a,b);
        assertEquals(2,result);
    }


    @Test
    void divide() {
        int result = calculator.divide(a,b);
        assertEquals(0,result);
    }



}