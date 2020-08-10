public class TestCourse {
	public static void main(String[] args) {
		Course course1 = new Course("course1");
		Course course2 = new Course("course2");
		
		course1.addStudent("Peter Jones");
		course1.addStudent("Brian Smith");
		course1.addStudent("Anne Kennedy");
		
		course2.addStudent("S1");
		course2.addStudent("S2");
		course2.addStudent("S3");
		course2.addStudent("S4");
		
		System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
		for(int i = 0; i < course1.getNumberOfStudents(); i++) {
			System.out.print(course1.getStudents()[i]);
			if(i != (course1.getNumberOfStudents() - 1))
				System.out.print(", ");
			else
				System.out.println();
		}
		
		System.out.println("Number of students in course2: " + course2.getNumberOfStudents());
		for(int i = 0; i < course2.getNumberOfStudents(); i++) {
			System.out.print(course2.getStudents()[i]);
			if(i != (course2.getNumberOfStudents() - 1))
				System.out.print(", ");
			else
				System.out.println();
		}
		
		course1.dropStudent("Peter Jones");
		System.out.println("Number of students in course1 after drop Peter Jones: " + course1.getNumberOfStudents());
		for(int i = 0; i < course1.getNumberOfStudents(); i++) {
			System.out.print(course1.getStudents()[i]);
			if(i != (course1.getNumberOfStudents() - 1))
				System.out.print(", ");
			else
				System.out.println();
		}
		
		course1.clear();
		System.out.println("Number of students in course1 after clear: " + course1.getNumberOfStudents());
		
		course2.dropStudent("S2");
		System.out.println("Number of students in course2 after drop S2: " + course2.getNumberOfStudents());
		for(int i = 0; i < course2.getNumberOfStudents(); i++) {
			System.out.print(course2.getStudents()[i]);
			if(i != (course2.getNumberOfStudents() - 1))
				System.out.print(", ");
			else
				System.out.println();
		}
		
		course2.clear();
		System.out.println("Number of students in course2 after clear: " + course2.getNumberOfStudents());
	}
}
