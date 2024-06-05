package ch.bbw.jpa.ListeAllerSchauplaetze.Film;

import ch.bbw.jpa.ListeAllerSchauplaetze.Film.Film;
import ch.bbw.jpa.ListeAllerSchauplaetze.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/films")
public class FilmController extends GenericController<Film, Integer> {
}