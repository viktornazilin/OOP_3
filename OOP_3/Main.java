import Controller.Controller;
import Data.Student;
import Data.StudyGroup;
import Data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.createStudent("Andrey","Kononov","Ivanovich");
        controller.createStudent("Alexey","Sumin","Anatolievich");
        controller.createStudent("Viktor","Nazilin","Sergeevich");
        controller.createStudent("Daniil","Nazilin","Sergeevich");

        List<Student> studentList = controller.getStudents();

        Teacher teacher = controller.createTeacher("Pogoreltsev","Alexandr","Alexandrovich");

        StudyGroup studyGroup1 = controller.createStudyGroup(teacher,studentList);

        List<Student> studentList2 = new ArrayList<>();

        studentList2.add(controller.createStudent("Lev","Lvov","Lvovich"));
        studentList2.add(controller.createStudent("Leonard","Leonardov","Leonardovich"));
        studentList2.add(controller.createStudent("Ivan","Ivanov","Ivanovich"));
        Teacher teacher2 = controller.createTeacher("Andrey","Andreev","Andreevich");

        StudyGroup studyGroup2 = controller.createStudyGroup(teacher2,studentList2);
        controller.sortStudyGroup(studyGroup1);
        controller.sortStudyGroup(studyGroup2);
        
        System.out.println("________________________________");
        controller.sendOnConsoleSortStudents(controller.getStudents());
    }
}