import java.util.ArrayList;

public class memoryLeak {
    private static List <Integer> list=new ArrayList<>();

    public static void addData(){
        for(int i=0;i<1000000;i++){
            list.add(i); 
        }
    }
}
// list static - stays as long as program run
// it is growing old data is never removed 
//GC cannot free the objects becuase reference is still alive 