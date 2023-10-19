public class Student {

	private String name;
	private String surname;
	private String grade;

	public Student(String name, String surname, String grade) {

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
