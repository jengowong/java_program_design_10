package learn.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Java注解解析
 * <pre/>
 * 我们将使用反射技术来解析java类的注解。
 * 那么注解的RetentionPolicy应该设置为RUNTIME，
 * 否则java类的注解信息在执行过程中将不可用，
 * 那么我们也不能从中得到任何和注解有关的数据。
 */
public class AnnotationParsing {

    public static void main(String[] args) {
        try {
            for (Method method : AnnotationParsing.class
                    .getClassLoader()
                    .loadClass(("learn.annotation.AnnotationExample"))
                    .getMethods()) {
                // checks if MethodInfo annotation is present for the method
                if (method.isAnnotationPresent(MethodInfo.class)) {
                    try {
                        // iterates all the annotations available in the method
                        for (Annotation anno : method.getDeclaredAnnotations()) {
                            System.out.println("Annotation in Method " + method + " : " + anno);
                        }
                        MethodInfo methodAnno = method.getAnnotation(MethodInfo.class);
                        if (methodAnno.revision() == 1) {
                            System.out.println("Method with revision no 1 = " + method);
                        }

                    } catch (Throwable ex) {
                        ex.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
