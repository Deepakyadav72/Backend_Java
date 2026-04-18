public class Constructors{
    public static void main (String[] args){

        Student s1=new Student();
        Student s2=new Student("Deepak");
        Student s3=new Student(71);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}

class Student{
    String name;
    int roll;
    // =======This is NonParameretize constructor======
    Student(){
        System.out.println("THIS is the constructor");
    }
      // ===========This is Parameretize constructor=====
    Student(String name){
        this.name=name;

    }
    Student(int roll){
        this.roll=roll; 
        
    }
}