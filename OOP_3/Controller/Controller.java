package Controller;

import Data.Student;
import Data.StudyGroup;
import Data.StudyGroupComparator;
import Data.Teacher;
import Service.StudyGroupService;
import Service.UserService;
import View.StudyGroupView;
import View.UserView;

import java.util.List;

public class Controller {
    private final UserService userService = new UserService();
    private final UserView userView = new UserView();
    private final StudyGroupService studyGroupService = new StudyGroupService();
    private final StudyGroupView studyGroupView = new StudyGroupView();
    private final StudyGroupComparator studyGroupComparator = new StudyGroupComparator();
    public Student createStudent(String firstName, String lastName, String patronymic){
        Student student = userService.createStudent(firstName, lastName, patronymic);
        List<Student> students = userService.getStudents();
        userView.sendOnConsoleStudents(students);
        return student;
    }
    public Teacher createTeacher(String firstName, String lastName, String patronymic){
        Teacher teacher = userService.createTeacher(firstName, lastName, patronymic);
        List<Teacher> teachers = userService.getTeachers();
        userView.sendOnConsoleTeachers(teachers);
        return teacher;
    }
    public void createStudyGroup(Teacher teacher, List<Student> studentList){
        studyGroupService.createStudyGroup(teacher,studentList);
        List<StudyGroup> studyGroups = studyGroupService.getStudyGroups();
        studyGroupView.sendOnConsoleStudyGroups(studyGroups);
    }
    public List<Student> getStudents(){
        List<Student> students = userService.getStudents();
        userView.sendOnConsoleStudents(students);
        return students;
    }
    public void sendOnConsoleStudyGroups(){
        List<StudyGroup> studyGroups = studyGroupService.getStudyGroups();
        studyGroupView.sendOnConsoleStudyGroups(studyGroups);
    }
    public void sendOnConsoleSortStudyGroup(List<Student> students){
        students.sort(studyGroupComparator);
        userView.sendOnConsoleStudents(students);
    }
}