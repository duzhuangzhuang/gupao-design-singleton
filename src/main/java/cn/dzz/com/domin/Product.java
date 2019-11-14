package cn.dzz.com.domin;

/**
 * @author duzhuangzhuang&#13;
 * @version CMR&#13;
 * @date: 2019\11\14 0014 14:32
 **/
public class Product
{
    private String data;
    
    public String getData()
    {
        return data;
    }
    
    public void setData(String data)
    {
        this.data = data;
    }
    
    @Override
    public String toString()
    {
        return "Product{" + "data='" + data + '\'' + '}';
    }
}
