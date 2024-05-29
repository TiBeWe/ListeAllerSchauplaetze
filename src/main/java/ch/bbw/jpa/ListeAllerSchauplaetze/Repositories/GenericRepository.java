package ch.bbw.jpa.ListeAllerSchauplaetze.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericRepository<T, ID> extends CrudRepository<T, ID> {
    // Du kannst hier generische Methoden definieren, falls nötig
}
