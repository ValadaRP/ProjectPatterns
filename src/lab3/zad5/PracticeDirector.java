package lab3.zad5;

public class PracticeDirector {
    PracticeBuilder practiceBuilder;

    public void setPracticeBuilder(PracticeBuilder practiceBuilder) {
        this.practiceBuilder = practiceBuilder;
    }

    public void constructPilotPractice(PracticeBuilder builder, String studyDegree){
        builder.setStudyDegree(studyDegree);
        builder.setPracticeTask("Pilot practice task");
        builder.setScientificTutor("Pilot scientific tutor");
        builder.setCaregiver("Pilot caregiver");
        builder.setPassForm("Pilot pass form");
    }
    public void constructCoursePractice(PracticeBuilder builder, String studyDegree){
        builder.setStudyDegree(studyDegree);
        builder.setPracticeTask("Course practice task");
        builder.setScientificTutor("Course scientific tutor");
        builder.setCaregiver("Course caregiver");
        builder.setPassForm("Course pass form");
    }

}
