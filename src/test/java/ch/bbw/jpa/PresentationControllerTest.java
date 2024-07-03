package ch.bbw.jpa;

import ch.bbw.jpa.ListeAllerSchauplaetze.Presentation.Presentation;
import ch.bbw.jpa.ListeAllerSchauplaetze.Presentation.PresentationController;
import ch.bbw.jpa.ListeAllerSchauplaetze.Presentation.PresentationService;
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

class PresentationControllerTest {

    @Mock
    private PresentationService presentationService;

    @InjectMocks
    private PresentationController presentationController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllPresentations() {
        List<Presentation> presentations = new ArrayList<>();
        presentations.add(new Presentation());
        when(presentationService.getAllPresentations()).thenReturn(presentations);

        List<Presentation> result = presentationController.getAllPresentations();
        assertEquals(1, result.size());
        verify(presentationService, times(1)).getAllPresentations();
    }

    @Test
    void testGetPresentationById() {
        Presentation presentation = new Presentation();
        when(presentationService.getPresentationById(1)).thenReturn(Optional.of(presentation));

        Presentation result = presentationController.getPresentationById(1).getBody();
        assertNotNull(result);
        verify(presentationService, times(1)).getPresentationById(1);
    }

    @Test
    void testAddPresentation() {
        Presentation presentation = new Presentation();
        when(presentationService.savePresentation(any(Presentation.class))).thenReturn(presentation);

        Presentation result = presentationController.addPresentation(presentation).getBody();
        assertNotNull(result);
        verify(presentationService, times(1)).savePresentation(presentation);
    }
}
