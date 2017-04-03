package ustc.gr.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by Black on 2017/4/3.
 */
public class MyProxyFactory {
    public static Object getProxy(Object target) throws Exception{
        MyInvocationHandler handler = new MyInvocationHandler();
        handler.setTarget(target);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),handler);
    }
}
