import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;


class SayImpl implements Say {
    @Override
    public void sayHello(String words) {
        System.out.println("hello:" + words);
    }
}
class TestInvocationHandler implements InvocationHandler {

    private Object target;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestInvocationHandler that = (TestInvocationHandler) o;
        return Objects.equals(target, that.target);
    }

    @Override
    public int hashCode() {
        return Objects.hash(target);
    }

    public TestInvocationHandler(Object target) {
        this.target=target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke begin");
        System.out.println("method :"+ method.getName()+" is invoked!");
        method.invoke(target,args);
        System.out.println("invoke end");
        return null;
    }
}
public class proxyTest {
    public static void main(String[] args) {

        SayImpl say1 = new SayImpl();
        print(say1);
        TestInvocationHandler testInvocationHandler = new TestInvocationHandler(new SayImpl());
        Say say = (Say) Proxy.newProxyInstance(SayImpl.class.getClassLoader(), SayImpl.class.getInterfaces(), testInvocationHandler );
        say.sayHello("my dear");
    }
    public static void print(Object obj)
    {
        System.out.println(obj);
    }
}
