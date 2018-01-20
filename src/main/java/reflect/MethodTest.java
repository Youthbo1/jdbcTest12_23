package reflect;


import org.junit.Test;

import java.lang.reflect.Method;

/**
 * \Date: 2018/1/20
 * \
 * \Description:
 * \
 */
public class MethodTest {

    @Test// 测试公有的方法
    public void demo1() throws Exception{
        Class aClass=Class.forName("reflect.Person");

        Person p= (Person) aClass.newInstance();

        Method method=aClass.getMethod("eat");
        // 执行该方法:
        // person.eat();
        method.invoke(p);
    }

    @Test// 测试私有的方法
    public void demo2() throws Exception{
        Class aClass=Class.forName("reflect.Person");

        Person p= (Person) aClass.newInstance();

        Method method=aClass.getDeclaredMethod("eat");
        // 执行该方法:
        // person.eat();
        method.setAccessible(true);
        method.invoke(p,null);
    }

    @Test// 测试私有的方法带参数
    public void demo3() throws Exception{
        Class aClass=Class.forName("reflect.Person");

        Person p= (Person) aClass.newInstance();

        Method method=aClass.getDeclaredMethod("sayHello",String.class);
        // 执行该方法:
        // person.eat();
        method.setAccessible(true);
        Object object=method.invoke(p,"fyb");
        System.out.println(object);
    }
}
