package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class TimeSlots implements Serializable {

    @Id
    private String timeSlots;

    public TimeSlots() {
    }

    public TimeSlots(String timeSlots) {
        this.timeSlots = timeSlots;
    }

    public String getTimeSlots() {
        return timeSlots;
    }

    public void setTimeSlots(String timeSlots) {
        this.timeSlots = timeSlots;
    }

}
