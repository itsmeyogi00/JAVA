import java.lang.reflect.Array;

public class Student{
    int studentId;
    String name;
    static float[] grades= {70,60,80,90,100};


    // constructor
    public Student(int studentId,String name){
        this.studentId= studentId;
        this.name=name;
    }
    //method to calculate the average of grades
    public float calculateAverage(){
        System.out.println("Name: "+name);
        System.out.println("Student ID: "+studentId);
        float Total=0;

        for(int i =0;i<grades.length;i++){
            Total=Total+grades[i];
        }
        float average=Total/5;
        System.out.println("Tha average is : "+average);
        return average;
    }

    public static void main(String[] args) {
        Student st= new Student(41324,"Yogesh");
        st.calculateAverage();
    }

}