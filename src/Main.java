import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		List<Student> allStudents = new ArrayList<>();
		List<Student> passedStudents = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("Name: ");
			String inputName = scanner.nextLine();

			if (inputName.equalsIgnoreCase("Quit")) {
				break;
			}

			System.out.println("Surname: ");
			String inputSurname = scanner.nextLine();

			if (inputSurname.equalsIgnoreCase("Quit")) {
				break;
			}

			System.out.println("Grade: ");
			int inputGrade = scanner.nextInt();

			if (Integer.toString(inputGrade).equalsIgnoreCase("Quit")) {
				break;
			}

			Student student = new Student(inputName, inputSurname, inputGrade);

			if (inputGrade >= 5 && inputGrade <= 10) {

				allStudents.add(student);
			}else {

				System.out.println("Unknown grade");
			}

			if (inputGrade > 5 && inputGrade <= 10) {

				passedStudents.add(student);
			}
		}

		System.out.println("All students: " + allStudents);
		System.out.println("Passed students: " + passedStudents);
	}
}