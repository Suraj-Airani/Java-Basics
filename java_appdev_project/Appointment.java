package java_appdev_project;

import java.time.LocalDateTime;

public class Appointment {
    private String type;
    private LocalDateTime dateTime;
    private String notes;

    public Appointment(String type, LocalDateTime dateTime, String notes) {
        this.type = type;
        this.dateTime = dateTime;
        this.notes = notes;
    }

    public String getType() { return type; }
    public LocalDateTime getDateTime() { return dateTime; }
    public String getNotes() { return notes; }
}
