class Student{
    // Attributes
    String name;
    int Age;
    char Grades;
    //Construcor
    Student(String n, int a, char g){
        this.name = n;
        this.Age = a;
        this.Grades = g;
    }

        //methods

    void Info(){
        System.out.println("name is:" + name + "Age is: " +Age + "grade: " +Grades);

        }
    }





public class OOP {
    public static void main(String[] args) {
        Student s = new Student("Shrikrushna", 21, 'A');
        System.out.println(s.name);
        System.out.println(s.Age);
        System.out.println(s.Grades);
    }
}
