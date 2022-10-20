import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;;

public class DocSearchTest {
    @Test 
	public void test1() throws URISyntaxException, IOException {
        Handler h = new Handler("/technical");
        URI rootPath = new URI("http://localhost/");
        assertEquals(h.handleRequest(rootPath), "Don't know how to handle that path!");
	}
}
