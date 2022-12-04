package View;

import Data.StudyGroup;
import java.util.List;
import java.util.logging.Logger;

public class StudyGroupView {
    public void sendOnConsoleStudyGroups(List<StudyGroup> studyGroups) {
        Logger log = Logger.getAnonymousLogger();
        for (StudyGroup studyGroup : studyGroups) {
                log.info(studyGroup.toString());
        }
    }
}