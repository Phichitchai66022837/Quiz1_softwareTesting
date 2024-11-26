import org.junit.Test;
import static org.junit.Assert.*;

public class quiz01Test {


    quiz01 quiz = new quiz01();

    @Test
    public void testNomalGroup() {

        assertTrue("Should return true for Normal Group", quiz.NomalGroup(120, 99));


        assertFalse("Should return false for Normal Group", quiz.NomalGroup(121, 100));
    }

    @Test
    public void testRiskGroup() {

        assertTrue("Should return true for Risk Group", quiz.RiskGroup(130, 110));

        assertFalse("Should return false for Risk Group", quiz.RiskGroup(120, 99));
    }

    @Test
    public void testSickGroup() {

        assertTrue("Should return true for SickGroup Level 1", quiz.SickGroup(150, 130));

        assertTrue("Should return true for SickGroup Level 2", quiz.SickGroup(170, 160));

        assertTrue("Should return true for SickGroup Level 3", quiz.SickGroup(180, 190));


        assertFalse("Should return false for SickGroup", quiz.SickGroup(119, 99));
    }

    @Test
    public void testMainFunction() {

        assertTrue("Should match Normal Group", quiz.MainFunction(120, 99));

        assertTrue("Should match Risk Group", quiz.MainFunction(130, 110));


        assertTrue("Should match SickGroup Level 1", quiz.MainFunction(150, 130));


        assertTrue("Should match SickGroup Level 2", quiz.MainFunction(170, 160));


        assertTrue("Should match SickGroup Level 3", quiz.MainFunction(180, 190));


        assertFalse("Should not match any group", quiz.MainFunction(119, 99));
    }
}
