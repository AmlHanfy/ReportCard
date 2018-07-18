package com.example.aml.reportcard;

public class ReportCard{
    private String subject;
    private String subjectGrade;

    public ReportCard(String defaultSubject, String defaultSubjectGrade) {
        subject = defaultSubject;
        subjectGrade = defaultSubjectGrade;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSubjectGrade(String subjectGrade) {
        this.subjectGrade = subjectGrade;
    }

    public String getSubject() {

        return subject;
    }

    public String getSubjectGrade() {
        return subjectGrade;
    }
    public String toString() {

        return  "Name : Aml Hanfy Mahmoud; English grade: A; History grade: B-; Math grade: B+;";
    }
}
