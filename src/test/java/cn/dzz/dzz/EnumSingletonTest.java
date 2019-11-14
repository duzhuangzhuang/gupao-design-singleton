package cn.dzz.dzz;

import cn.dzz.com.register.EnumSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @author duzhuangzhuang&#13;
 * @version CMR&#13;
 * @date: 2019\11\14 0014 10:53
 **/
public class EnumSingletonTest
{
   /* public static void main(String[] args)
    {
        EnumSingleton s1 = null;
        
        EnumSingleton s2 = EnumSingleton.getInstance();
        s2.setData(new Object());
        FileOutputStream fos = null;
        try
        {
            fos = new FileOutputStream("EnumSingleton.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();
            
            FileInputStream fis = new FileInputStream("EnumSingleton.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (EnumSingleton)ois.readObject();
            ois.close();
            System.out.println(s1.getData() == s2.getData());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }*/
    public static void main(String[] args)
    {
        try
        {
            Class clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(String.class, int.class);
            c.setAccessible(true);
            EnumSingleton enumSingleton = (EnumSingleton)c.newInstance("dzz", 666);
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
