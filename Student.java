public class Student{
    //private data members 
    private String name;
    private int age;
    private double gpa;
    //insulize the constructor 
    public Student(String name,int age,double gpa){
        this.name=name;
        this.age=age;
        this.gpa=gpa;
    }
    //getter method and setter mathod
    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        
        return age;
    }
        public void setAge(int age){
            if(age>=0){
            this.age=age;

        }
        else{
            System.out.println("invalid age");

        }

        }
        public double getGpa(){
            return gpa;

        }
        public void setGpa(double gpa){
            if(gpa>=0 && gpa<=5.0){
                this.gpa=gpa;

            }
            else{
                System.out.println("invalid gpa");

            }
        }
        public void displayStudentInfo(){
            System.out.println("student Name:" +name);
            System.out.println("Student age:"+age);
            System.out.println("Student Gpa:"+gpa);

        }
        public static void main(String args[]){
            Student student=new Student("Naveen",19,5.0);
            student.displayStudentInfo();
            student.setName("Naveena");
            student.setAge(18);
            student.setGpa(4.5);
            student.displayStudentInfo();


        }
    }
