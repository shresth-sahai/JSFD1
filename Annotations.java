public class Annotations {
    // meta data to java code 
    // usage is optional
    // we can use this meta data info at run time and it adds certain logic 
    // to code 

    // read -> reflection 


    public interface InnerAnnotations {
            public boolean fly();
        
    }

    public class Eagle implements InnerAnnotations{
        @Override
        public boolean fly(){
            return true;
        }
    }
}

/*
Types of annotations 
Pre defined annotations 
Meta Annotatiosn 
@Target 
@Documented 



Code  -> class & Methods
@Override 


Define our custom annotations 


@Depreciated -> used in class/ method warning 
@SupressWarning-> ignore the warning 

interview specific 
Heap pollution -> Object of one type storing the reference of another type 

eg public class Log{

Object[]  objlist=loglist;

List<String> stringloglist=new ArrayList<>();

stringloglist.add("hello");
objlist[0]=stringloglist;

}
https://medium.com/@vinciabhinav7/why-use-spring-annotations-8d2c0fdc1b6f
*/
