package pl.twojadruzyna.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.twojadruzyna.model.Event;

@Repository
public interface EventRepo extends JpaRepository<Event,Long> {
}
