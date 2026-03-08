package Arrays;
import java.util.Scanner;
import java.util.*;
public class StudentsGPA {
    static class Student{
        String name;
        double gpa;
        public Student(String name,double gpa){
            this.name=name;
            this.gpa=gpa;
        }
    }
    public static void main(String[] args) {
        int topper =0;
        int deansList =0;
        Scanner input = new Scanner(System.in);

        ArrayList<Student> list = new ArrayList<>();
        //taking 5 inputs from user
        for (int i=0; i<5; i++){
            System.out.print("Enter Student " + (i+1) + " name: ");
            String name = input.nextLine();
            System.out.print("Enter Student " + (i+1) + " GPA: ");
            double gpa = input.nextDouble();
            input.nextLine();
            list.add(new Student(name, gpa));
        }
        //hardcoding other 5 inputs
        list.add(new Student("Hani", 3.2));
        list.add(new Student("Samia", 3.7));
        list.add(new Student("Nida", 4.0));
        list.add(new Student("Saim", 2.5));
        list.add(new Student("Shiza", 2.0));
/*
        Iterator<Student> iterator = list.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if(student.gpa<2.0){
                iterator.remove();
            }
            if(student.gpa>3.5){
                deansList++;
            }

        }*/
        double maxGpa = list.get(0).gpa;
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if(student.gpa<2.0){
                list.remove(i);
                i--;
                continue;
            }
            if(student.gpa>3.5){
                deansList++;
            }
            if(list.get(i).gpa > maxGpa){
                maxGpa = list.get(i).gpa;
                topper = i;
            }
        }
        System.out.println("\nCount of the Dean's List: " +  deansList);
        System.out.println("The maximum GPA is " + maxGpa + " scored by " + list.get(topper).name);
        System.out.println("\nStudents with GPA >= 2.0, others removed:");
        for (Student student : list) {
            System.out.println("Name: " + student.name + ", GPA: " + student.gpa);
        }
    }
}
