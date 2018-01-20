package JUnit_Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/20.
 */
public class DemoTest {

    public  static Demo d=new Demo();

    @Test
    public void main() throws Exception {
    }

    @Before
    public void createDb() throws Exception {
        d.createDb();
    }

    @Test
    public void insert() throws Exception {
        Map param=new HashMap();
        param.put("id","7");
        param.put("name","fyb");
        param.put("password","12345446");
        d.insert(param);
    }

    @Test
    public void getAll() throws Exception {
        d.getAll();
    }

    @After
    public void close() throws Exception {
        d.close();
    }

}