package BranchCoverageTest;


import org.exemple.Anagram;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Exo2Test {
    private Anagram anagram ;
    @BeforeEach
    public void upset(){
        anagram = new Anagram()  ;
    }
    @Test
    public void isAnagramTestNULL(){
        boolean results  = anagram.isAnagram(null,null) ;
        Assertions.fail() ;
    }
    @Test

    public void isAnagramTestDfrLength(){

    }


}