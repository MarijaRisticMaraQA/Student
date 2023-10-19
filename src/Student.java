public class Student {

	private String name;
	private String surname;
	private int grade;

	public Student(String name, String surname, int grade) {

		this.name = name;
		this.surname = surname;
		this.grade = grade;
	}

	@Override
	public String toString() {

		return "Student{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", grade='" + grade + '\'' +
				'}';
	}
}
