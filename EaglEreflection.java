import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class EaglEreflection {
    
    public String breed;
    private boolean canSwim;

    public void Fly(){
        System.out.println("fly");
    }
    public void eat(){
         System.out.println("eat");
    }
}
class main{
    public static void main(String[] args) {
        Class eagClass=EaglEreflection.class;
        System.out.println(eagClass.getName()); // Eagle 
         System.out.println(eagClass.getModifiers()); // public 
    }
}
// java.lang.reflect 


// invokign methods using 


public class  Eagle {
    Eagle(){

    }
    String name;
    public void fly(int intParam,boolean boolparam,String strparam){
        System.out.print(intParam + boolparam+strparam);
    }
}
public class Main{
    public static void main(String[] args) {
        Class eagClass=Class.forName("Eagle");
        Method flyMethod =eagClass.getMethod(1, 1,"1");
        Field field[]=eagClass.getFields()
    }
}