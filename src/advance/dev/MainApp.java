package advance.dev;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
	 public static void input(Student[] students) {
	        Scanner scanner = new Scanner(System.in);
	        for (int i = 0; i < students.length; i++) {
	            System.out.println("Student " + (i + 1) + ":");
	            System.out.print("Name: ");
	            String name = scanner.nextLine();
	            System.out.print("Age: ");
	            int age = Integer.parseInt(scanner.nextLine());
	            System.out.print("Address: ");
	            String address = scanner.nextLine();
	            System.out.print("Phone number: ");
	            String phoneNumber = scanner.nextLine();
	            System.out.print("Average score: ");
	            float avgScore = Float.parseFloat(scanner.nextLine());
	            Student student = new Student();
	            student.setName(name);
	            student.setAge(age);
	            student.setAddress(address);
	            student.setPhone_number(phoneNumber);
	            student.setAvgScore(avgScore);
	            students[i] = student;
	        }
	    }

	    public static void print(Student[] students) {
	        for (int i = 0; i < students.length; i++) {
	            Student student = students[i];
	            System.out.println("Student " + (i + 1) + ":");
	            System.out.println("Name: " + student.getName());
	            System.out.println("Age: " + student.getAge());
	            System.out.println("Address: " + student.getAddress());
	            System.out.println("Phone number: " + student.getPhone_number());
	            System.out.println("Average score: " + student.getAvgScore());
	        }
	    }

	    public static void sortByAvgScore(Student[] students) {
			Arrays.sort(students, (s1, s2) -> Float.compare(s1.getAvgScore(), s2.getAvgScore()));
	    }

	    public static void main(String[] args) {
	        Student[] students = new Student[10];
	        input(students);
	        System.out.println("List of students:");
	        print(students);
	        sortByAvgScore(students);
	        System.out.println("List of students sorted by average score:");
	        print(students);
	    }
}
