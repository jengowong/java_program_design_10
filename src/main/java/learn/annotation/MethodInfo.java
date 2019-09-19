package learn.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * http://ifeve.com/java-annotations/
 * <pre/>
 * Java注解提供了关于代码的一些信息，但并不直接作用于它所注解的代码内容。
 *
 * Java1.5引入了注解。
 * 注解作为程序的元数据嵌入到程序当中。
 * 注解可以被一些解析工具或者是编译工具进行解析。
 * 我们也可以声明注解在编译过程或执行时产生作用。
 *
 * 在使用注解之前，程序源数据只是通过java注释和javadoc，
 * 但是注解提供的功能要远远超过这些，
 * 注解不仅包含了元数据，它还可以作用于程序运行过程中，
 * 注解解释器可以通过注解决定程序的执行顺序。
 */
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    /**
     * 创建自定义注解和创建一个接口相似，但是注解的interface关键字需要以@符号开头。我们可以为注解声明方法。
     * <pre/>
     * 1.注解方法不能带有参数；
     * 2.注解方法返回值类型限定为：基本类型、String、Enums、Annotation或者是这些类型的数组；
     * 3.注解方法可以有默认值；
     * 4.注解本身能够包含元注解，元注解被用来注解其它注解。
     *
     * 有四种类型的元注解：
     * 1.@Documented  指明拥有这个注解的元素可以被javadoc此类的工具文档化。
     * 2.@Target      指明该类型的注解可以注解的程序元素的范围。
     * 3.@Inherited   指明该注解类型被自动继承。
     * 4.@Retention   指明了该Annotation被保留的时间长短。
     *
     * Java提供了三种内建注解：
     * 1.@Override          当我们想要复写父类中的方法时，我们需要使用该注解去告知编译器我们想要复写这个方法。
     * .....................这样一来当父类中的方法移除或者发生更改时编译器将提示错误信息。
     * 2.@Deprecated        当我们希望编译器知道某一方法不建议使用时，我们应该使用这个注解。
     * 3.@SuppressWarnings  这个仅仅是告诉编译器忽略特定的警告信息，例如在泛型中使用原生数据类型。
     * .....................它的保留策略是SOURCE，并且被编译器丢弃。
     */
    String author() default "Pankaj";

    String comments();

    String date();

    int revision() default 1;

}
