package lab3.zad5;

public class Practice {
    String studyDegree;
    String practiceForm;
    String practiceTask;
    String scientificTutor;
    String caregiver;
    String passForm; 

    public Practice(String studyDegree, String practiceForm, String practiceTask, String scientificTutor, String caregiver, String passForm) {
        this.studyDegree = studyDegree;
        this.practiceForm = practiceForm;
        this.practiceTask = practiceTask;
        this.scientificTutor = scientificTutor;
        this.caregiver = caregiver;
        this.passForm = passForm;
    }

    public Practice() {
    }

    public String getStudyDegree() {
        return studyDegree;
    }

    public void setStudyDegree(String studyDegree) {
        this.studyDegree = studyDegree;
    }

    public String getPracticeForm() {
        return practiceForm;
    }

    public void setPracticeForm(String practiceForm) {
        this.practiceForm = practiceForm;
    }

    public String getPracticeTask() {
        return practiceTask;
    }

    public void setPracticeTask(String practiceTask) {
        this.practiceTask = practiceTask;
    }

    public String getScientificTutor() {
        return scientificTutor;
    }

    public void setScientificTutor(String scientificTutor) {
        this.scientificTutor = scientificTutor;
    }

    public String getCaregiver() {
        return caregiver;
    }

    public void setCaregiver(String caregiver) {
        this.caregiver = caregiver;
    }

    public String getPassForm() {
        return passForm;
    }

    public void setPassForm(String passForm) {
        this.passForm = passForm;
    }

    @Override
    public String toString() {
        return "Practice{" +
                "studyDegree='" + studyDegree + '\'' +
                ", practiceForm='" + practiceForm + '\'' +
                ", practiceTask='" + practiceTask + '\'' +
                ", scientificTutor='" + scientificTutor + '\'' +
                ", caregiver='" + caregiver + '\'' +
                ", passForm='" + passForm + '\'' +
                '}';
    }
}
