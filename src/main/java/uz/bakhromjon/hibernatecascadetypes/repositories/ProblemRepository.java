package uz.bakhromjon.hibernatecascadetypes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.bakhromjon.hibernatecascadetypes.entities.Problem;

@Repository
public interface ProblemRepository extends JpaRepository<Problem, Integer> {
}
