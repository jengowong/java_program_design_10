package learn.guava.optional;

import org.junit.Test;

/**
 * 在学习和使用Guava的Optional之前，需要来了解一下Java中null。
 * 因为，只有深入的了解了null的相关知识，
 * 才能更加深入体会领悟到Guava的Optional设计和使用上的优雅和简单。
 */
public class NullTest {

    /**
     * Java中，null是一个关键字，用来标识一个不确定的对象。
     * 因此可以将null赋给引用类型变量，但不可以将null赋给基本类型变量。
     */
    @Test
    public void testNull() {
        //int age;
        int age = 0;
        System.out.println("user age: " + age);

        long money;
        money = 10L;
        System.out.println("user money: " + money);

        //String name;
        String name = null;
        System.out.println("user name: " + name);
    }

    /**
     * null只是一个关键字，用来标识一个不确定的对象，他既不是对象，也不是Object对象的实例。
     */
    @Test
    public void testNullObject() {
        if (null instanceof java.lang.Object) {
            System.out.println("null属于java.lang.Object类型");
        } else {
            System.out.println("null不属于java.lang.Object类型");
        }
    }

}
