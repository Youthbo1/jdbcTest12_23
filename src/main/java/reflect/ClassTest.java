package reflect;

import org.junit.Test;

/**
 * \Date: 2018/1/20
 * \
 * \Description:
 * \
 */
public class ClassTest {

    @Test
    public void demo1() throws ClassNotFoundException {
        //1
        Class c = Person.class;

        //2
        Person p = new Person();
        Class c1 = p.getClass();

        //3

        Class c3 = Class.forName("reflect.Person");



    }
}
