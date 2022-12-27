package uz.bakhromjon.hibernatecascadetypes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.bakhromjon.hibernatecascadetypes.entities.Appeal;

@Repository
public interface AppealRepository extends JpaRepository<Appeal, Integer> {
}
