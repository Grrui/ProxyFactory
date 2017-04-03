package ustc.gr.proxy;

/**
 * 模拟事务拦截器
 * Created by Black on 2017/4/3.
 */
public class TxUtil {
    public void beginTx(){
        System.out.println("======模拟开始事务======");
    }
    public void endTx(){
        System.out.println("======模拟结束事务======");
    }
}
