package ch.bbw.jpa.ListeAllerSchauplaetze.Room;

import ch.bbw.jpa.ListeAllerSchauplaetze.GenericController;
import ch.bbw.jpa.ListeAllerSchauplaetze.Film.Film;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/films")
public class RoomController extends GenericController<Film, Integer> {
}