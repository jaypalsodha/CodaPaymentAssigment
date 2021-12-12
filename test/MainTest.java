import com.home.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void createObject_test() {
        Main main = new Main();
        Assertions.assertNotNull(main);
    }

}
