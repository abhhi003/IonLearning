import java.util.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Do not alter code in main method */
       Shirt[] shirts = new Shirt[5];
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<5;i++)
        {
            int tag = sc.nextInt();sc.nextLine();
            String brand = sc.nextLine();
            double price = sc.nextDouble();sc.nextLine();
            char g = sc.nextLine().charAt(0);
            shirts[i] = new Shirt(tag,brand,price,g);
        }
        
        
       
        double price = sc.nextDouble();
        
        for(Shirt s: shirts)
        {
            System.out.println(getDiscountPrice(s));            
        }
        
        Shirt[] result = getShirtWithMoreThanSpecificPrice(shirts,price);
        
        for(Shirt s: result)
        {
            System.out.println(s.getTag()+" "+s.getPrice()+ " " + s.getBrand());
        }
    }
    
    public static double getDiscountPrice(Shirt s)
    {
        double discountPrice = 0;
        if (s.getGender()=='m')
        {
            discountPrice = s.getPrice() - (s.getPrice() * 0.1);
        }
        if (s.getGender()=='f')
        {
            discountPrice = s.getPrice() - (s.getPrice() * 0.2);
        }
        if (s.getGender()=='u')
        {
            discountPrice = s.getPrice() - (s.getPrice() * 0.3);
        }
        return discountPrice;
    }
   
    public static Shirt[] getShirtWithMoreThanSpecificPrice(Shirt[] shirts,double price)
    {
        List<Shirt> l = new ArrayList<Shirt>();
        for(int i=0;i<shirts.length;i++)
        {
            if(shirts[i].getPrice()>price)
            {
                l.add(shirts[i]);
            }
        }
        Shirt[] res = new Shirt[l.size()];
        for(int i=0;i<l.size();i++)
        {
            res[i]=l.get(i);
        }
        Arrays.sort(res, new priceSort());
        return res;
    }
}
class priceSort implements Comparator<Shirt>{
    public int compare (Shirt s1, Shirt s2)
    {
        double d = s1.getPrice() - s2.getPrice();
        if (d>0) return 1;
        if (d<0) return -1;
        return 0;
    }
}

class Shirt
{
    private int tag;
    private String brand;
    private double price;
    private char gender;
    Shirt(int tag, String brand, double price, char gender)
    {
        this.tag=tag;
        this.brand=brand;
        this.price=price;
        this.gender=gender;
    }
    public int getTag() {
        return tag;
    }
    public void setTag(int tag) {
        this.tag = tag;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }   
}