public class encap {
    // binding the data and methods together and protecting from direct access

//data -> private 
// access -> public methods -> getter . setter 

class student{
    public int marks;
}
public static void main(String[] args) {
student s=new student();
s.marks=-100;
} // bad practice 
}

public class student{
    private int marks; // hidden
    public void setMarks(int marks){

    }
    public void getMarks(){

    }
    public static void main(String[] args) {
        Student s=new Student();
        s.set(83);
        System.out.print(s.getMarks());
    }
}
// ATM -> ATM -> user cannt ditectl check 
// he just 