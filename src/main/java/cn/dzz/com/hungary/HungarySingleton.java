package cn.dzz.com.hungary;

import java.io.Serializable;

/**
 * @author duzhuangzhuang&#13;
 * @version CMR&#13;
 * @date: 2019\11\13 0013 21:56
 **/
public class HungarySingleton implements Serializable
{
    private static final HungarySingleton hungarySingleton = new HungarySingleton();
    
    private HungarySingleton()
    {
        
    }
    
    public static HungarySingleton getInstance()
    {
        return hungarySingleton;
    }
    
    public Object readResolve()
    {
        return hungarySingleton;
    }
}
