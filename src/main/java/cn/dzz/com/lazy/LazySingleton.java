package cn.dzz.com.lazy;

/**
 * @author duzhuangzhuang&#13;
 * @version CMR&#13;
 * @date: 2019\11\13 0013 22:31
 **/
public class LazySingleton
{
    private static LazySingleton lazySingleton = null;

    private LazySingleton(){}

    public LazySingleton getInstance(){
        //存在线程安全问题，多个线程返回的对象可能不同
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
