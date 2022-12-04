import Controller.Controller;
import Data.Student;
import Data.StudyGroup;
import Data.Teacher;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.createStudent("Nazilin","Viktor","Ivanovich");
        System.out.println("-------------");

        controller.createStudent("Nazilin","Viktor","Sergeevich");
        System.out.println("-------------");

        controller.createStudent("Nazilin","Daniil","Sergeevich");
        System.out.println("-------------");

        controller.createTeacher("Nazilin","Sergey","Viktorovich");
        System.out.println("-------------");

        List<Student> studentList = controller.getStudents();
        Teacher teacher = controller.createTeacher("Gamova","Anna","Michailovna");

        controller.createStudyGroup(teacher,studentList);
        System.out.println("-------------");

        controller.sendOnConsoleStudyGroups();
        
        System.out.println("-------------");
        controller.sendOnConsoleSortStudyGroup(studentList);
    }
}