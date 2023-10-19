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
			String inputGrade = scanner.nextLine();

			if (inputGrade.equalsIgnoreCase("Quit")) {
				break;
			}

			Student student = new Student(inputName, inputSurname, inputGrade);

			if ((Integer.parseInt(inputGrade) > 4 && Integer.parseInt(inputGrade) < 10)) {
				allStudents.add(student);
				System.out.println("All students: " + allStudents);
			}else {

				System.out.println("Unknown grade");
			}

			if (Integer.parseInt(inputGrade) > 5) {

				passedStudents.add(student);
				System.out.println("Passed students: " + passedStudents);
			}
		}
	}
}