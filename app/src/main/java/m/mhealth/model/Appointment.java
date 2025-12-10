package mhealth.model;

public class Appointment {
    private String id, patientId, doctorId, date, time, reason, status;
    
    public Appointment() {}
    
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
}