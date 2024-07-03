package ch.bbw.jpa;

import ch.bbw.jpa.ListeAllerSchauplaetze.Room.Room;
import ch.bbw.jpa.ListeAllerSchauplaetze.Room.RoomController;
import ch.bbw.jpa.ListeAllerSchauplaetze.Room.RoomService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class RoomControllerTest {

    @Mock
    private RoomService roomService;

    @InjectMocks
    private RoomController roomController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllRooms() {
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room());
        when(roomService.getAllRooms()).thenReturn(rooms);

        List<Room> result = roomController.getAllRooms();
        assertEquals(1, result.size());
        verify(roomService, times(1)).getAllRooms();
    }

    @Test
    void testGetRoomById() {
        Room room = new Room();
        when(roomService.getRoomById(1)).thenReturn(Optional.of(room));

        Optional<Room> result = roomController.getRoomById(1);
        assertTrue(result.isPresent());
        assertEquals(room, result.get());
        verify(roomService, times(1)).getRoomById(1);
    }

    @Test
    void testAddRoom() {
        Room room = new Room();
        when(roomService.saveRoom(any(Room.class))).thenReturn(room);

        Room result = roomController.addRoom(room).getBody();
        assertNotNull(result);
        verify(roomService, times(1)).saveRoom(room);
    }
}
