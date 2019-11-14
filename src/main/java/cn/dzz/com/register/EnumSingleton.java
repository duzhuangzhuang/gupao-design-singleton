package cn.dzz.com.register;

/**
 * @author duzhuangzhuang&#13;
 * @version CMR&#13;
 * @date: 2019\11\14 0014 10:50
 **/
//常量中去使用，常量不就是大家能够公用？
    //通常在通用api中使用
public enum EnumSingleton
{
    INSTANCE;
    
    private Object data;
    
    public Object getData()
    {
        return data;
    }
    public void setData(Object data)
    {
        this.data = data;
    }
    
    public static EnumSingleton getInstance()
    {
        return INSTANCE;
    }
    
}
