package cn.dzz.dzz;

import cn.dzz.com.lazy.LazyInnerSingleton;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

/**
 * @author duzhuangzhuang&#13;
 * @version CMR&#13;
 * @date: 2019\11\14 0014 9:39
 **/
public class LazyInnerSingletonTest
{
    public static void main(String[] args)
    {
        try{
        Class<?> clazz = LazyInnerSingleton.class;
        Constructor<?> constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        Object o1 = constructor.newInstance();
        Object o2= LazyInnerSingleton.getInstance();
        System.out.println(o1==o2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
