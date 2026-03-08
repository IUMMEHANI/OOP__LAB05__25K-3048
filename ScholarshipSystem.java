package Arrays;
import java.util.Scanner;
public class ScholarshipSystem {
    int[] marks = new int[12];
    Scanner sc = new Scanner(System.in);
    public void MarksInput() {
        for (int i = 0; i < marks.length ; i++){
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }
    public double ClassAverage(){
        int sum = 0;
        int average = 0;
        for(int i = 0; i < marks.length ; i++){
            sum = sum + marks[i];
        }
        average = sum / marks.length;
        return average;
    }
    public void SetGraceMarks(){
        for(int i = 0; i < marks.length ; i++){
            if(marks[i]<40){
                marks[i] = 40;
            }
        }
        for(int i = 0; i < marks.length ; i++){
            System.out.println("Student " + (i+1) + "marks: " + marks[i] + "\n");
        }
    }
    public int StudentWithFullScholarship(){
        int FullScholarship = 0;
        for(int i = 0; i < marks.length ; i++){
            if(marks[i]>=85){
                FullScholarship++;
            }
        }
        return FullScholarship;
    }
    public int StudentWithHalfScholarship(){
        int HalfScholarship = 0;
        for(int i = 0; i < marks.length ; i++){
            if(marks[i]>=70 && marks[i]<85){
                HalfScholarship++;
            }
        }
        return HalfScholarship;
    }
    public int StudentWithNoScholarship(){
        int NoScholarship = 0;
        for(int i = 0; i < marks.length ; i++){
            if(marks[i]<70){
                NoScholarship++;
            }
        }
        return NoScholarship;
    }
    public int StudentsScoreBelowClassAverage(){
       double Average = ClassAverage();
       int BelowAverage = 0;
       for (int i = 0; i < marks.length ; i++){
           if(marks[i]<Average){
               BelowAverage++;
           }
       }
       return BelowAverage;
    }
    public static void main(String[] args) {
        ScholarshipSystem system = new ScholarshipSystem();
        system.MarksInput();
        double Average = system.ClassAverage();
        int SFULL = system.StudentWithFullScholarship();
        int SHALF = system.StudentWithHalfScholarship();
        int Sno = system.StudentWithNoScholarship();
        int SBelowAvg = system.StudentsScoreBelowClassAverage();
        System.out.println("Class Average: " + Average);
        System.out.println("Students with Full Scholarships: " + SFULL);
        System.out.println("Students with HALF Scholarships: " + SHALF);
        System.out.println("Students with no Scholarships: " + Sno);
        System.out.println("Students below Class average: " + SBelowAvg);
        system.SetGraceMarks();

    }

}
