package cn.dzz.com.seriable;

import java.io.Serializable;

/**
 * 序列化破坏单例
 *
 * @author duzhuangzhuang&#13;
 * @version CMR&#13;
 * @date: 2019\11\14 0014 9:54
 **/
public class SeriableSingleton implements Serializable
{
    
    // 序列化就是说把内存中的状态通过转换成字节码的形式
    // 从而转换一个IO流，写入到其他地方(可以是磁盘、网络IO)
    // 内存中状态给永久保存下来了
    
    // 反序列化
    // 讲已经持久化的字节码内容，转换为IO流
    // 通过IO流的读取，进而将读取的内容转换为Java对象
    // 在转换过程中会重新创建对象new
    private static SeriableSingleton seriableSingleton = null;
    
    private SeriableSingleton()
    {
    }
    
    public static SeriableSingleton getInstance()
    {
        if (seriableSingleton == null)
        {
            seriableSingleton = new SeriableSingleton();
        }
        return seriableSingleton;
    }

    //对象实际上还是创建了两次，只不过在jvm层面做了替换操作，相对安全
    //之前创建的对象会被GC回收
    public Object readResolve()
    {
        return seriableSingleton;
    }
    
}
