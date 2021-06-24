class complex
{
    int image;
    int real;
    complex(int image,int real)
    {
        this.image=image;
        this.real=real;
    }
    void add(complex c1,complex c2)
    {
        
        System.out.println("addition of two complex number is: "+(c1.image+c2.image)+"+"+(c1.real+c2.real)+" i");
    }
}
public class complexNumber {
    public static void main(String[] args) {
        complex c1=new complex(4,5);
        complex c2=new complex(1,4);

        c1.add(c1,c2);

      
    }
  }