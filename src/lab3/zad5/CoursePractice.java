package lab3.zad5;

public class CoursePractice implements PracticeBuilder {

    String studyDegree;
    String practiceTask;
    String scientificTutor;
    String caregiver;
    String passForm;

    @Override
    public void setStudyDegree(String studyDegree) {
        this.studyDegree = studyDegree;
    }

    @Override
    public void setPracticeTask(String task) {
        this.practiceTask = task;
    }

    @Override
    public void setScientificTutor(String tutor) {
        this.scientificTutor = tutor;
    }

    @Override
    public void setCaregiver(String caregiver) {
        this.caregiver = caregiver;
    }

    @Override
    public void setPassForm(String passForm) {
        this.passForm = passForm;
    }

    public Practice getPractice() {
        return new Practice(studyDegree, "Course", practiceTask, scientificTutor, caregiver, passForm);
    }
}
