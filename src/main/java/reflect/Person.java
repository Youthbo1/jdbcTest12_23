package reflect;

/**
 * \Date: 2018/1/20
 * \
 * \Description:
 * \
 */
public class Person {
    private String name;
    private String sex;

    public Person() {
        super();
    }

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }


    public void eat(){
        System.out.println("吃....");
    }

    private void run(){
        System.out.println("跑.....");
    }

    private String sayHello(String name){
        return "Hello "+name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", sex=" + sex + "]";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
