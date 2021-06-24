class product{
    int pcode;
    String pname;
    double price;
    product(int pcode,String pname,double price){
    this.pcode=pcode;
    this.pname=pname;
    this.price=price;    
    }
    void small(product p1,product p2,product p3)
    {
        if ((p1.price<p2.price) && (p1.price<p3.price))
        {
            System.out.println("lowest price is : "+p1.price);
        }
        else if ((p2.price<p1.price) && (p2.price<p3.price))
        {
            System.out.println("lowest price is : "+p2.price);

        }
        else
        {
            System.out.println("lowest price is : "+p3.price);

        }
        
    }
}
public class lowprice{
    public static void main(String[] args) {
        product p1=new product(1,"samsung",50);
        product p2=new product(2,"oneplus",40);
        product p3=new product(3,"nokia",80);
        p3.small(p1,p2,p3);
        
      
    }
  }