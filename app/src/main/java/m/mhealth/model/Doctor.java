package mhealth.model;

public class Doctor {
    private String id, name, email, specialization, phone;
    
    public Doctor() {}
    
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}