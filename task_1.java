import org.junit.Test;
import static org.junit.Assert.*;

public class ProgramTest {

    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        assertEquals("Expected true for age 19, but got false", true, 
isAdult);
    }
}

class Program {
    public boolean checkIsAdult(int age) {
        return age >= 18;
    }
}
