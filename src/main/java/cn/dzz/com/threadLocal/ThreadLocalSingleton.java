package cn.dzz.com.threadLocal;

/**
 * @author duzhuangzhuang&#13;
 * @version CMR&#13;
 * @date: 2019\11\14 0014 14:45
 **/
// 注册式单例容器式
    //伪线程安全
    //使用ThreadLocal来实现数据源动态切换
    //讲Spring源码的时候，会手写ORM并实现多数据源
public class ThreadLocalSingleton
{
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>()
    {
        @Override
        protected ThreadLocalSingleton initialValue()
        {
            return new ThreadLocalSingleton();
        }
    };
    
    private ThreadLocalSingleton()
    {
    }
    
    public static ThreadLocalSingleton getInstance()
    {
        return threadLocalInstance.get();
    }
}
