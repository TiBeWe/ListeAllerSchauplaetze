package ch.bbw.jpa.ListeAllerSchauplaetze.Film;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends CrudRepository<Film, Integer> {
    Iterable<Film> findByName(String title);
}
