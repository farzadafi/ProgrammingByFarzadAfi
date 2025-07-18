package k_oop.f_exercise;

public class Main {
    public static void main(String[] args) {
        //for student class
//        Student student = new Student(1, "farzad afi");
//        student.setGrade(14.8f);
//        System.out.println(student.getGrade());
//        System.out.println(student.getId());
//        System.out.println(student.getName());
//        System.out.println("letter grade is: " + student.getLetterGrade());
//        System.out.println();
//        student.printInfo();
//        student.updateGrade(15.8f);
//        System.out.println(student.getGrade());

        Course course = new Course();
//        Student student = new Student(1, "farzad");
//        course.addStudent(student);

        course.addSomeStudent();
//        course.printCourseReport();

//        Student topStudent = course.findTopStudent();
//        System.out.println(topStudent.getName());
//        Student badStudent = course.findBadStudent();
//        System.out.println(badStudent.getName());
//        Student byId = course.findStudentById(2);
//        System.out.println(byId.getName());

        System.out.println("Before remove student");
        course.printStudents();
        course.removeById(3);
        System.out.println("\n after remove students:");
        course.printStudents();
    }
}
