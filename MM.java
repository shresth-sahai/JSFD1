import java.time.Period;

public class MM {
    public static void main(String[] args) {
        int primitiveVariable =10;
        Person pobj =new Person();

        String stringLiteral="12";
        MemoryManagement memObj=new MemoryManagement();
        memObj.memoryManagementTest(pobj);
    }

    private void memoryManagementTest(Person pobj){
        Person pobj2=pobj;
        String str2="24";
        String str3=new String("1");
    }
    
}


stack                                                heap 
str3                                              "1"
str2                                              memObj
pobj2  --> reference                                     pobj
pobj
primitiveVariable


once scope gets deleted they removed from the stack as well 
now stack get cleared but references are gc will delete the unreferenced objects 
of the heap