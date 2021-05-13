package homework;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor(1, "Engin ", "Demirog");
		Instructor instructor2 = new Instructor(2, "Ali ", "Yilmaz");
		
		Instructor[] instructors = {instructor1, instructor2};
		
		
		Course course1 = new Course(1, "Java+React ", "Yazilim Gelistirme Kursu ", "ucretsiz");
		Course course2 = new Course(2, "C# + Angular ", "Yazilim Gelistirme Kursu ", "ucretsiz");
		Course course3 = new Course(3, "Programlamaya Giris ", "Temel Kurs", "ucretsiz");
		
		Course[] courses = {course1, course2, course3};
	   
	    for (Course course : courses) {
			System.out.println(course.courseName + course.courseDetails );
		}	
	    
	    for (Instructor instructor : instructors) {
	    	System.out.println(instructor.instructorName + instructor.instructorSurname);
			
		}
	    System.out.println("Toplam Kurs Sayisi: " + courses.length);
	       
		CourseManager courseManager = new CourseManager();
		courseManager.joinTheCourse(course1);
		     
	    InstructorManager instructorManager = new InstructorManager();
	    instructorManager.chooseInstructor(instructor1);
 
	    courseManager.removeCourse(course3);
	    
	}
		
}
