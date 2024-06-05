package ch.bbw.jpa.ListeAllerSchauplaetze.Presentation;


import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "presentation")
public class Presentation implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int presentation_id;
    private Date date;
    private Time time;

    public Presentation() {
    }

    public Presentation(int presentation_id, Date date, Time time) {
        this.presentation_id = presentation_id;
        this.date = date;
        this.time = time;
    }

    public int getPresentation_id() {
        return presentation_id;
    }

    public void setPresentation_id(int presentation_id) {
        this.presentation_id = presentation_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
