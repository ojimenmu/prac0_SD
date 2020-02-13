import org.junit.Test;
import static org.junit.Assert.*;
import utils.ComUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ComUtilsTest {

    @Test
    public void example_test() {
        File file = new File("test");
        try {
            file.createNewFile();
            ComUtils comUtils = new ComUtils(new FileInputStream(file), new FileOutputStream(file));
            comUtils.write_int32(2);
            int readedInt = comUtils.read_int32();

            assertEquals(2, readedInt);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test_char(){
        File file = new File("test2");
        try {
            file.createNewFile();
            ComUtils comUtils = new ComUtils(new FileInputStream(file), new FileOutputStream(file));
            comUtils.writeChar('H');
            char char2 = comUtils.readChar();

            assertEquals('H', char2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
