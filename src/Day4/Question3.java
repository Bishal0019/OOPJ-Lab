package Day4;

class Student{
    int roll;
    String name;

    Student(int roll, String name){
        this.roll=roll;
        this.name=name;
    }

    void display(){
        System.out.println("Roll = "+roll);
        System.out.println("Name = "+name);
    }

    boolean equal(Object obj){
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;

        Student s = (Student) obj;
        return this.roll==s.roll && this.name.equals(s.name);
    }
}

public class Question3 {
    public static void main(String[] args){
        Student s1,s2;
        s1=new Student(1,"Bishal");
        s2=new Student(1,"Bishal");

        if(s1.equal(s2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}
