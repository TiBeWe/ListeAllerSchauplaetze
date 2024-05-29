package ch.bbw.jpa.ListeAllerSchauplaetze.Repositories;

import ch.bbw.jpa.ListeAllerSchauplaetze.Film;
import ch.bbw.jpa.ListeAllerSchauplaetze.Repositories.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends GenericRepository<Film, Integer> {
}
