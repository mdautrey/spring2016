package lab1.pojo;

import java.io.IOException;

/**
 * Created by mint on 17/05/16.
 */
public interface DataAccessInterface {
    public String read() throws IOException;
    public void write(String text) throws IOException;
}
