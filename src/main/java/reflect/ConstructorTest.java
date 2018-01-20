package reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * \Date: 2018/1/20
 * \
 * \Description:
 * \
 */
public class ConstructorTest {

    @Test
    public void demo1() throws Exception{
        Class aClass=Class.forName("reflect.Person");

        Constructor c=aClass.getConstructor();
        Person p= (Person) c.newInstance();

    }

    @Test
    public void demo2() throws Exception {
        Class aClass=Class.forName("reflect.Person");

        Constructor c=aClass.getConstructor(String.class,String.class);
        Person p= (Person) c.newInstance("fyb","man");

        System.out.println(p);
    }

}
