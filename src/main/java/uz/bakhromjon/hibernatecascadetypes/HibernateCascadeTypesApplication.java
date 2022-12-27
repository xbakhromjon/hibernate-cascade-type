package uz.bakhromjon.hibernatecascadetypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uz.bakhromjon.hibernatecascadetypes.entities.Appeal;
import uz.bakhromjon.hibernatecascadetypes.entities.Problem;
import uz.bakhromjon.hibernatecascadetypes.repositories.AppealRepository;
import uz.bakhromjon.hibernatecascadetypes.repositories.ProblemRepository;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class HibernateCascadeTypesApplication implements CommandLineRunner {


    private AppealRepository appealRepository;

    private ProblemRepository problemRepository;

    @Autowired
    public void setAppealRepository(AppealRepository appealRepository) {
        this.appealRepository = appealRepository;
    }

    @Autowired
    public void setProblemRepository(ProblemRepository problemRepository) {
        this.problemRepository = problemRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(HibernateCascadeTypesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Appeal appeal = new Appeal(1, "appeal");
//        appeal = appealRepository.save(appeal);
//        Problem problem1 = new Problem("problem1", appeal);
//        Problem problem2 = new Problem("problem2", appeal);
//        problem1 = problemRepository.save(problem1);
//        problem2 = problemRepository.save(problem2);
//        Optional<Appeal> appealOptional = appealRepository.findById(1);
//        List<Problem> problems = problemRepository.findAll();
        appealRepository.deleteById(1);
    }
}
