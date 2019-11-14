package cn.dzz.com.lazy;

/**
 * @author duzhuangzhuang&#13;
 * @version CMR&#13;
 * @date: 2019\11\13 0013 22:56
 **/
public class LazyDoubleCheckSingleton
{
    //volatile 解决指令重排序
    private volatile static LazyDoubleCheckSingleton lazySingleton = null;

    private LazyDoubleCheckSingleton(){}

    /**
     * 双重检查锁
     * @return
     */
    public LazyDoubleCheckSingleton getInstance(){
        //存在线程安全问题，多个线程返回的对象可能不同
        if(lazySingleton == null){
            synchronized (lazySingleton){
                if(lazySingleton == null){
                    lazySingleton = new LazyDoubleCheckSingleton();
                    //CPU执行的时候会转换成JVM指令执行
                    //1 分配内存给这个对象
                    //2 初始化对象
                    //3 将初始化好的对象和内存地址建立联系，赋值
                    //4 用户初次访问

                    //由于cpu资源分配问题，3步骤可能在2步骤之前执行，多线程的情况下会造成指令重排序的问题，使用关键字volatile解决这个问题
                }

        }}
        return lazySingleton;
    }
}
