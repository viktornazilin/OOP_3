package Service;

import Data.Student;
import Data.Teacher;
import Data.User;

import java.util.List;

public interface DataService {
    Student createStudent(String firstName, String lastName, String patronymic);
    Teacher createTeacher(String firstName, String lastName, String patronymic);
    List<User> getUsers();
    List<Student> getStudents();
    List<Teacher> getTeachers();
    void deleteUser(Long id);
}