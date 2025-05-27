```java
import java.lang.reflect.Method;

public class ReflectionExample {
    public void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("ReflectionExample");
            Object obj = cls.getDeclaredConstructor().newInstance();
            Method method = cls.getMethod("sayHello", String.class);
            method.invoke(obj, "Alice");

            for (Method m : cls.getDeclaredMethods()) {
                System.out.println("Method: " + m.getName());
            }
        } catch (Exception e) {
            System.out.println("Reflection error: " + e.getMessage());
        }
    }
}
```