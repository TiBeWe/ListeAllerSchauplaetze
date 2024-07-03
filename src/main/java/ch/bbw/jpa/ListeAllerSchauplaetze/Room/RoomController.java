package ch.bbw.jpa.ListeAllerSchauplaetze.Room;

import ch.bbw.jpa.ListeAllerSchauplaetze.GenericController;
import ch.bbw.jpa.ListeAllerSchauplaetze.Film.Film;
import org.apache.catalina.authenticator.SavedRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/films")
public class RoomController extends GenericController<Film, Integer> {
    public List<Room> getAllRooms() {
        // Hier würde die Logik stehen, um alle Räume aus der Datenquelle zu holen
        return null; // Dummy-Wert, bitte entsprechend implementieren
    }

    // Methode zum Rückgeben eines Raumes nach bestimmten Kriterien
    public Room thenReturn() {
        // Hier würde die Logik stehen, um einen Raum zu finden und zurückzugeben
        return null; // Dummy-Wert, bitte entsprechend implementieren
    }

    // Methode zum Abrufen des Inhalts (getBody) eines Raumes
    public String getBody(Room room) {
        // Hier würde die Logik stehen, um den Inhalt (body) eines Raumes zurückzugeben
        return null; // Dummy-Wert, bitte entsprechend implementieren
    }

    // Methode zum Hinzufügen eines Raumes
    public void addRoom(Room room) {

    }

    // Methode zum Speichern (saveRoom) eines Raumes
    public void saveRoom(Room room) {

    }