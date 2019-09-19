package learn.guava.optional;

import com.google.common.base.Optional;
import org.junit.Test;

import java.util.Set;

/**
 * 关键在于，null值不能指明到底null代表了什么含义。
 *
 * 大多数情况下程序员使用null是为了表示某种不存在的意思，
 * 也许应该有一个value，但是这个value是空或者这个value找不到。
 * 比方说，在用不存在的key值从map中取value，Map.get返回null表示没有、该map中不包含这个key。
 *
 * 若T类型数据可以为null，Optional<T>是用来以非空值替代T数据类型的一种方法。
 * 一个Optional对象可以包含一个非空的T引用（这种情况下我们称之为“存在的”）
 * 或者不包含任何东西（这种情况下我们称之为“空缺的”）。
 * 但Optional从来不会包含对null值的引用。
 */
public class OptionalTest {

    @Test
    public void testOptional() throws Exception {
        Optional<Integer> possible = Optional.of(6);
        if (possible.isPresent()) {
            System.out.println("possible isPresent:" + possible.isPresent());
            System.out.println("possible value:" + possible.get());
        }
    }

    /**
     * 常用静态方法
     */
    @Test
    public void testOptional_static() throws Exception {
        Optional<Integer> possible = Optional.of(6);
        Optional<Integer> absentOpt = Optional.absent();
        Optional<Integer> NullableOpt = Optional.fromNullable(null);
        Optional<Integer> NoNullableOpt = Optional.fromNullable(10);

        if (possible.isPresent()) {
            System.out.println("possible isPresent:" + possible.isPresent());
            System.out.println("possible value:" + possible.get());
        }
        if (absentOpt.isPresent()) {
            System.out.println("absentOpt isPresent:" + absentOpt.isPresent());
        }
        if (NullableOpt.isPresent()) {
            System.out.println("fromNullableOpt isPresent:" + NullableOpt.isPresent());
        }
        if (NoNullableOpt.isPresent()) {
            System.out.println("NoNullableOpt isPresent:" + NoNullableOpt.isPresent());
            System.out.println("NoNullableOpt value:" + NoNullableOpt.get());
        }
    }

    /**
     * 实例方法
     */
    @Test
    public void testMethodReturn() {
        Optional<Long> value = method();
        if (value.isPresent()) {
            System.out.println("获得返回值: " + value.get());
        } else {
            System.out.println("获得返回值: " + value.or(-12L));
        }
        System.out.println("获得返回值 orNull: " + value.orNull());

        Optional<Long> valueNoNull = methodNoNull();
        if (valueNoNull.isPresent()) {
            Set<Long> set = valueNoNull.asSet();
            System.out.println("获得返回值 set 的 size : " + set.size());
            System.out.println("获得返回值: " + valueNoNull.get());
        } else {
            System.out.println("获得返回值: " + valueNoNull.or(-12L));
        }
        System.out.println("获得返回值 orNull: " + valueNoNull.orNull());
    }

    private Optional<Long> method() {
        return Optional.fromNullable(null);
    }

    private Optional<Long> methodNoNull() {
        return Optional.fromNullable(15L);
    }

}
