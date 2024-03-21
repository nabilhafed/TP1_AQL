package BranchCoverageTest;

import org.exemple.QuadraticEquation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Exo04Test {
    private QuadraticEquation quadraticEquation  ;

    @BeforeEach
    public void setUp(){
        quadraticEquation = new QuadraticEquation() ;
    }
    @Test
    public void solveTestANull(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> quadraticEquation.solve(0,2,5));
    }
    @Test
    public void solveTestDeltaInferieurANull(){
        Assertions.assertNull( quadraticEquation.solve(1,1,1));

    }
    @Test
    public void solveTest(){
        double[] results = quadraticEquation.solve(1,2,1)  ;
        Assertions.assertEquals(-1,results[0]);
    }

}
