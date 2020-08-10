public class Course {
  private String courseName;
  private String[] students = new String[3];
  private int numberOfStudents;
    
  public Course(String courseName) {
    this.courseName = courseName;
  }
  
  public void addStudent(String student) {
	if (numberOfStudents >= students.length) {
	  String[] temp = new String[students.length * 2];
	  System.arraycopy(students, 0, temp, 0, students.length);
	  students = temp;
	}
	students[numberOfStudents] = student;
    numberOfStudents++;
  }
  
  public String[] getStudents() {
    return students;
  }

  public int getNumberOfStudents() {
    return numberOfStudents;
  }  

  public String getCourseName() {
    return courseName;
  }  
  
  public void dropStudent(String student) {
	  String[] newStudents = new String[students.length-1];
	  for(int i = 0; i < numberOfStudents; i++) {
		  if(students[i] == student) {
			  for(int j=0;j<i;j++)
				  newStudents[j]=students[j];
			  students[i]=null;
			  for(int j = i; j < numberOfStudents-1; j++)
				  newStudents[j] = students[j+1];
			  students = newStudents;
			  --numberOfStudents;
		  }
	  }
  }
  
  public void clear() {
		for(int i = 0; i < numberOfStudents; i++) {
			students[i] = null;
		}
		numberOfStudents = 0;
  }
}
