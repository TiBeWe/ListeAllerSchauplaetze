package ch.bbw.jpa;

import ch.bbw.jpa.ListeAllerSchauplaetze.Film.Film;
import ch.bbw.jpa.ListeAllerSchauplaetze.Film.FilmController;
import ch.bbw.jpa.ListeAllerSchauplaetze.Film.FilmService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class FilmControllerTest {

    @Mock
    private FilmService filmService;

    @InjectMocks
    private FilmController filmController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllFilms() {
        List<Film> films = new ArrayList<>();
        films.add(new Film());
        when(filmService.getAllFilms()).thenReturn(films);

        List<Film> result = filmController.getAllFilms();
        assertEquals(1, result.size());
        verify(filmService, times(1)).getAllFilms();
    }

    @Test
    void testGetFilmById() {
        Film film = new Film();
        when(filmService.getFilmById(1)).thenReturn(Optional.of(film));

        Film result = filmController.getFilmById(1).getBody();
        assertNotNull(result);
        verify(filmService, times(1)).getFilmById(1);
    }

    @Test
    void testAddFilm() {
        Film film = new Film();
        when(filmService.saveFilm(any(Film.class))).thenReturn(film);

        Film result = filmController.addFilm(film).getBody();
        assertNotNull(result);
        verify(filmService, times(1)).saveFilm(film);
    }
}
