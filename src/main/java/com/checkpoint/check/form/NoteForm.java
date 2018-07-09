package com.checkpoint.check.form;


/**
 * 笔录信息模版
 */
public class NoteForm {

    private String id;

    private String times;

    private  String number;

    private String startTime;

    private String endTime;

    private String surveyName;

    private String workAgency;

    private String notesName;

    private String notesAgency;

    private String beSurveyName;

    private String sex;

    private  String age;

    private String ethnic;

    private String political;

    private  String surveyAgency;

    private String job;

    private  String tel;

    private  String noteInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getSurveyName() {
        return surveyName;
    }

    public void setSurveyName(String surveyName) {
        this.surveyName = surveyName;
    }

    public String getWorkAgency() {
        return workAgency;
    }

    public void setWorkAgency(String workAgency) {
        this.workAgency = workAgency;
    }

    public String getNotesName() {
        return notesName;
    }

    public void setNotesName(String notesName) {
        this.notesName = notesName;
    }

    public String getNotesAgency() {
        return notesAgency;
    }

    public void setNotesAgency(String notesAgency) {
        this.notesAgency = notesAgency;
    }

    public String getBeSurveyName() {
        return beSurveyName;
    }

    public void setBeSurveyName(String beSurveyName) {
        this.beSurveyName = beSurveyName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic;
    }

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political;
    }

    public String getSurveyAgency() {
        return surveyAgency;
    }

    public void setSurveyAgency(String surveyAgency) {
        this.surveyAgency = surveyAgency;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNoteInfo() {
        return noteInfo;
    }

    public void setNoteInfo(String noteInfo) {
        this.noteInfo = noteInfo;
    }

    @Override
    public String toString() {
        return "NoteForm{" +
                "id='" + id + '\'' +
                ", times='" + times + '\'' +
                ", number='" + number + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", surveyName='" + surveyName + '\'' +
                ", workAgency='" + workAgency + '\'' +
                ", notesName='" + notesName + '\'' +
                ", notesAgency='" + notesAgency + '\'' +
                ", beSurveyName='" + beSurveyName + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", ethnic='" + ethnic + '\'' +
                ", political='" + political + '\'' +
                ", surveyAgency='" + surveyAgency + '\'' +
                ", job='" + job + '\'' +
                ", tel='" + tel + '\'' +
                ", noteInfo='" + noteInfo + '\'' +
                '}';
    }
}
