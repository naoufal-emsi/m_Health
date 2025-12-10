package mhealth.model;

public class Patient {
    private String id, name, email, phone, dateOfBirth, medicalHistory;
    
    public Patient() {}
    
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}