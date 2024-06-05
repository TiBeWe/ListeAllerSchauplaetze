package ch.bbw.jpa.ListeAllerSchauplaetze;

import ch.bbw.jpa.ListeAllerSchauplaetze.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

public class GenericController<T, ID> {
    @Autowired
    private GenericService<T, ID> service;

    @GetMapping
    public Iterable<T> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<T> getById(@PathVariable ID id) {
        return service.findById(id);
    }

    @PostMapping
    public T create(@RequestBody T entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public T update(@PathVariable ID id, @RequestBody T entity) {
        // Hier könntest du noch zusätzliche Logik einfügen, falls nötig
        return service.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ID id) {
        service.deleteById(id);
    }
}
