package LineCoverageTest;


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
        Assertions.assertThrows(NullPointerException.class, () -> anagram.isAnagram(null,null));
    }
    @Test
    public void isAnagramTestDfrLength(){
        boolean results = anagram.isAnagram("abc","ab") ;
        Assertions.assertFalse(results);
    }
    @Test
    public void isAnagramTestAnagram(){
        boolean results = anagram.isAnagram("abcd","bdca") ;
        Assertions.assertTrue(results);

    }


}