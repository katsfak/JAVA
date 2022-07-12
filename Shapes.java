import java.io.*;
import java.lang.*;

class ThreeDShape 
{
    
    private double width,height,piknotita;

    ThreeDShape()
    {
        width=height=piknotita=1;
    }

    ThreeDShape(double w, double h, double p)
    {
        width=w;
        height=h;
        piknotita=p;
    }

    ThreeDShape(double x)
    {
        width=height=piknotita=x;
    }

    double getWidth()
    {
        return width; 
    }

    double getHeight() 
    {
         return height; 
    }

    double getPiknotita() 
    {
         return piknotita; 
    }

    void setPiknotita(double p) 
    {
        piknotita = p; 
    }

    void setWidth(double w) 
    {
         width = w; 
    }

    void setHeight(double h) 
    { 
        height = h; 
    }

    void ShowInfo()
    {
        System.out.println(("Width is "+width+" Height is "+height));
    }
}

class Sfaira extends ThreeDShape
{
    
    private double aktina;

    void setAktina(double a) 
    { 
        aktina = a; 
    }

    Sfaira()
    {
        super();
        aktina=1;
    }

    Sfaira(double w, double h,double a,double p)
    {
        super(w,h,p);
        aktina=a;
    }

    Sfaira(double x)
    {
        super(x);
        aktina=x;
    }

    double getAktina() 
    {
         return aktina; 
    }

    double Area()
    {
        return 4*(Math.PI*Math.pow(aktina, 2));
    }

    double Volume()
    {
        return (4/3)*(Math.PI*Math.pow(aktina, 3));
    }

    double Mass()
    {
        return Volume()*getPiknotita();
    }

    void ShowAktina()
    {
        System.out.println(("Aktina is "+aktina));
    }
}

class OKkylindros extends ThreeDShape
{
    
    private double aktina;

    void setAktina(double a) { aktina = a; }


    OKkylindros()
    {
        super();
        aktina=1;
    }

    OKkylindros(double w, double h,double a,double p)
    {
        super(w,h,p);
        aktina=a;
    }

    double getAktina() 
    {
         return aktina; 
    }

    OKkylindros(double x)
    {
        super(x);
        aktina=x;
    }


    double Area()
    {
        return (2*Math.PI*aktina)*(getHeight()*aktina);
    }

    double Volume()
    {
        return Math.PI*(Math.pow(aktina, 2))*getHeight();
    }

    double Mass()
    {
        return Volume()*getPiknotita();
    }  

    void ShowAktina()
    {
        System.out.println(("Aktina is "+aktina));
    }

}

class Kyvo extends ThreeDShape
{

    Kyvo()
    {
        super();
        
    }

    Kyvo(double w, double h,double p)
    {
        super(w,h,p);
    }

    Kyvo(double x)
    {
        super(x);
    }

    double Area()
    {
        return 6*(Math.pow(getHeight()+getWidth(), 2));
    }

    double Volume()
    {
        return (Math.pow(getHeight()+getWidth(), 3));
    }

    double Mass()
    {
        return Volume()*getPiknotita();
    }

}

class Parallilepipedo extends ThreeDShape
{
    
    private double length;

    void setLength(double l)
    {
        length = l; 
    }

    Parallilepipedo()
    {
        super();
        length=1;
    }

    Parallilepipedo(double w, double h,double l,double p)
    {
        super(w,h,p);
        length=l;
    }

    double getLength() 
    {
         return length; 
    }

    Parallilepipedo(double x)
    {
        super(x);
        length=x;
    }

    double Area()
    {
        return 2*(getWidth()*length+getWidth()*getHeight()+length*getHeight());
    }

    double Volume()
    {
        return getWidth()*getHeight()*length;
    }

    double Mass()
    {
        return Volume()*getPiknotita();
    }  

    void ShowLenght()
    {
        System.out.println(("Lenght is "+length));
    }
}

class Shapes 
{
    public static void main(String[] args) 
    {
        Kyvo t1 = new Kyvo();
        System.out.println(("Kyvos: To emvadon einai "+ t1.Area()+" O ogkos einai "+t1.Volume()+" i maza einai "+t1.Mass()));
        Sfaira t2 = new Sfaira();
        System.out.println(("Sfaira: To emvadon einai "+ t2.Area()+" O ogkos einai "+t2.Volume()+" i maza einai "+t2.Mass()));
        Parallilepipedo t3 = new Parallilepipedo();
        System.out.println(("Orthogonio parallilepipedo: To emvadon einai "+ t3.Area()+" O ogkos einai "+t3.Volume()+" i maza einai "+t3.Mass()));
        OKkylindros t4 = new OKkylindros();
        System.out.println(("Kylindros: To emvadon einai "+ t4.Area()+" O ogkos einai "+t4.Volume()+" i maza einai "+t4.Mass()));
        //Kyvo t5= new Kyvo(-1);
        //System.out.println(("Kyvos: To emvadon einai "+ t5.Area()+" O ogkos einai "+t5.Volume()+" i maza einai "+t5.Mass()));

    }    
}
