package pl.twojadruzyna.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.twojadruzyna.model.Team;

@Repository
public interface TeamRepo extends JpaRepository<Team, Long> {
}
