public class Constructor {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Keshav", "Java", 20000);
        Teacher t2 = new Teacher("Satyam", "Aptitude", 40000);
        System.out.println("details of teacher 1:-");
        System.out.println("Teacher1 =" +t1.name);
        System.out.println("Teacher1 =" +t1.sub);
        System.out.println("Teacher1 =" +t1.sal);
        t1.teach();

        System.out.println("details of teacher 2:-");
        System.out.println("Teacher2 =" +t2.name);
        System.out.println("Teacher2 =" +t2.sub);
        System.out.println("Teacher2 =" +t2.sal);
        
        
    }
}

class Teacher{
    String name ;
    String sub ;
    int sal ;
    void teach(){
        System.out.println("A Teacher Teaches");
    }
    Teacher(String name, String sub, int sal){ 
        // Teacher is a Constructor here 
        this.name = name;
        this.sub = sub;
        this.sal = sal;
    }
}
