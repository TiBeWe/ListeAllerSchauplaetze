package ch.bbw.jpa.ListeAllerSchauplaetze.Film;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "film")
public class Film implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int film_id;
    private String title;

    public Film() {
    }

    public Film(int film_id, String title) {
        this.film_id = film_id;
        this.title = title;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
