package Service;

import Data.Student;
import Data.StudyGroup;
import Data.Teacher;
import Data.User;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
    private final List<StudyGroup> studyGroups;
    private Long studyGroupId = 0L;

    public StudyGroupService() {
        this.studyGroups = new ArrayList<>();
    }

    public List<User> createStudyGroup(Teacher teacher, List<Student> studentList){
        StudyGroup studyGroup = new StudyGroup(teacher,studentList,++studyGroupId);
        this.studyGroups.add(studyGroup);
        List<User> result = new ArrayList<>();
        result.add(studyGroup.teacher);
        result.addAll(studyGroup.studentList);
        return result;
    }

    public List<StudyGroup> getStudyGroups() {
        return this.studyGroups;
    }
    public void deleteStudyGroup(Long studyGroupId){
        this.studyGroups.removeIf(studyGroup -> studyGroupId.equals(studyGroup.getStudyGroupId()));
    }
}