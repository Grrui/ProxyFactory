package ustc.gr.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Black on 2017/4/3.
 */
public class MyInvocationHandler implements InvocationHandler{

    //需要被代理的对象
    private Object target;

    public void setTarget(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        TxUtil tx = new TxUtil();
        tx.beginTx();
        //以target作为主调来执行method方法
        Object result = method.invoke(target,args);
        tx.endTx();
        return result;
    }
}
