package Arrays;
import java.util.Scanner;
public class PatientTemperatures {
    Scanner sc = new Scanner(System.in);
    double[][] temperatures = new double[5][7];
    public void inputTemperatures(){
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter temperatures for Patient " + (i + 1));
               for (int j = 0; j < 7; j++) {
                    System.out.print("Day " + (j + 1) + ": ");
                    temperatures[i][j] = sc.nextDouble();
            }
        }
    }
    public void EquipmentCorrection() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (temperatures[i][j] < 95) {
                    temperatures[i][j] = 95;
                }
            }
        }
    }
    public double[] calculateAverages() {  //returns array
        double[] average = new double[5];
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                sum += temperatures[i][j];
            }
            average[i] = sum / 7;
            System.out.println("Average temperature of Patient " + (i + 1) + " = " + average[i]);
        }
        return average;
    }
    public void highestAverage(double[] avg) {
        double max = avg[0];
        int patient = 0;
        for (int i = 1; i < avg.length; i++) {
            if (avg[i] > max) {
                max = avg[i];
                patient = i;
            }
        }
        System.out.println("Patient with highest weekly average: Patient " + (patient + 1));
        System.out.println("Highest Average Temperature: " + max);
    }
    public void countHighTemperature() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (temperatures[i][j] > 100) {
                    count++;
                }
            }
        }
        System.out.println("\nTemperatures above 100°F occurred: " + count + " times");
    }
    public static void main(String[] args) {
        PatientTemperatures system = new PatientTemperatures();
        system.inputTemperatures();
        system.EquipmentCorrection();
        double[] averages = system.calculateAverages();
        system.highestAverage(averages);
        system.countHighTemperature();
    }
}


