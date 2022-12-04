package View;

import Data.Student;
import Data.Teacher;
import Data.User;

import java.util.List;
import java.util.logging.Logger;

public class UserView {
    public void sendOnConsoleStudents(List<Student> students) {
        Logger log = Logger.getAnonymousLogger();
        for (Student student : students) {
            log.info(student.toString());
        }
    }
    public void sendOnConsoleTeachers(List<Teacher> teachers) {
        Logger log = Logger.getAnonymousLogger();
        for (Teacher teacher : teachers) {
            log.info(teacher.toString());
        }
    }
    public void sendOnConsoleUsers(List<User> users) {
        Logger log = Logger.getAnonymousLogger();
        for (User user : users) {
                log.info(user.toString());
        }
    }
}