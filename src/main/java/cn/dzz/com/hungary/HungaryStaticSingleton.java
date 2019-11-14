package cn.dzz.com.hungary;

/**
 * 饿汉式单例静态写法
 *
 * @author duzhuangzhuang&#13;
 * @version CMR&#13;
 * @date: 2019\11\13 0013 22:26
 **/
public class HungaryStaticSingleton
{
    private static final HungaryStaticSingleton hungaryStaticSingleton;
    static
    {
        hungaryStaticSingleton = new HungaryStaticSingleton();
    }
    
    private HungaryStaticSingleton()
    {
    }
    
    public HungaryStaticSingleton getInstance()
    {
        return hungaryStaticSingleton;
    }
    
}
