package BranchCoverageTest;


import org.exemple.BinarySearch;
import org.exemple.BinarySearchCorrection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Exo3Test {
    private BinarySearch binarySearch  ;

     @BeforeEach
     public void setUp(){
        binarySearch  = new BinarySearch() ;
     }
     @Test
     public void binarySearchTestNUll(){
         Assertions.assertThrows(NullPointerException.class, () -> binarySearch.binarySearch(null,20));
     }
     @Test
     public void binarySearchTestExiste(){
         int[] tableauEntiers = {1, 2, 3, 4, 5, 6,7,8};
         int results = binarySearch.binarySearch(tableauEntiers,3) ;

         Assertions.assertEquals(2,results);
     }
    @Test
    public void binarySearchCorrectionTestExiste(){
        int[] tableauEntiers = {1, 2, 3, 4, 5, 6,7,8};
        BinarySearchCorrection binarySearchCorrection = new BinarySearchCorrection() ;
        int results = binarySearchCorrection.binarySearch(tableauEntiers,3) ;

        Assertions.assertEquals(2,results);
    }

}
