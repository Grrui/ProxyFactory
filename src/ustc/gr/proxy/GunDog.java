package ustc.gr.proxy;

/**
 * Created by Black on 2017/4/3.
 */
public class GunDog implements Dog{
    @Override
    public void info() {
        System.out.println("我是一只猎狗！");
    }

    @Override
    public void run() {
        System.out.println("我跑得飞快！");
    }
}
