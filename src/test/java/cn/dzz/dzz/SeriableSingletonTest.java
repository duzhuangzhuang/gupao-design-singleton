package cn.dzz.dzz;

import cn.dzz.com.seriable.SeriableSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author duzhuangzhuang&#13;
 * @version CMR&#13;
 * @date: 2019\11\14 0014 10:01
 **/
public class SeriableSingletonTest
{
    public static void main(String[] args)
    {
        SeriableSingleton s1 = null;
        SeriableSingleton s2 = SeriableSingleton.getInstance();
        FileOutputStream fos = null;
        try
        {
            fos = new FileOutputStream("SeriableSingleton.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();
            
            FileInputStream fis = new FileInputStream("SeriableSingleton.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SeriableSingleton)ois.readObject();
            ois.close();
            System.out.println(s1 == s2);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
