package cn.dzz.com.lazy;

/**
 * 内部类实现懒汉式单例
 *
 * @author duzhuangzhuang&#13;
 * @version CMR&#13;
 * @date: 2019\11\13 0013 23:05
 **/
// 这种形式兼顾了懒汉式的内存浪费，也兼顾synchronize性能问题
// 史上最牛的单例模式实现方式
public class LazyInnerSingleton
{
    private static LazyInnerSingleton lazySingleton = null;
    
    private LazyInnerSingleton()
    {
        // 虽然构造方法私有了但是会被反射攻击
        if (LazyHolder.LAZY != null)
        {
            throw new RuntimeException("不允許创建多个实例");
        }
    }
    
    // 全程没有用到synchronized，运用内部类由于外部类的加载机制，优先加载内部类
    // jvm底层执行逻辑
    public static final LazyInnerSingleton getInstance()
    {
        return LazyHolder.LAZY;
    }
    
    // 内部类的特点，只有调用到内部类的时候才会执行里面的代码,默认不加载
    public static class LazyHolder
    {
        private static final LazyInnerSingleton LAZY = new LazyInnerSingleton();
    }
}
