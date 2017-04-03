package ustc.gr.proxy;

/**
 * Created by Black on 2017/4/3.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Dog target = new GunDog();
        Dog dog = (Dog) MyProxyFactory.getProxy(target);
        dog.info();
        dog.run();
    }
}
