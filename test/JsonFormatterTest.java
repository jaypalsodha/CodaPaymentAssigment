import com.home.formatter.JsonFormatter;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class JsonFormatterTest {

    @Test
    public void format() {
        JsonFormatter jf = new JsonFormatter();
        List<String[]> csvData = new ArrayList<>();
        jf.format(csvData);
    }
}
