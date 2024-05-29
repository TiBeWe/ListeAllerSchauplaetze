package ch.bbw.jpa.ListeAllerSchauplaetze.Controller;

import ch.bbw.jpa.ListeAllerSchauplaetze.Controller.GenericController;
import ch.bbw.jpa.ListeAllerSchauplaetze.Film;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/films")
public class FilmController extends GenericController<Film, Integer> {
}