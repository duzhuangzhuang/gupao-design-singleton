package cn.dzz.dzz;

import cn.dzz.com.domin.ExcutorThread;
import cn.dzz.com.hungary.HungarySingleton;

/**
 * @author duzhuangzhuang&#13;
 * @version CMR&#13;
 * @date: 2019\11\13 0013 22:01
 **/
public class HungarySingletonTest
{
    public static void main(String[] args)
    {
        /*HungarySingleton instance = HungarySingleton.getInstance();
        System.out.println(instance);*/
        Thread thread1 = new Thread(new ExcutorThread());
        Thread thread2 = new Thread(new ExcutorThread());
        thread1.start();
        thread2.start();
    }
}
