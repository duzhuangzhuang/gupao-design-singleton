package cn.dzz.com.domin;

import cn.dzz.com.hungary.HungarySingleton;

/**
 * @author duzhuangzhuang&#13;
 * @version CMR&#13;
 * @date: 2019\11\13 0013 22:03
 **/
public class ExcutorThread implements Runnable
{
    public void run()
    {
        HungarySingleton instance = HungarySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+instance);
    }
}
