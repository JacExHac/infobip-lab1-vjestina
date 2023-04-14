package infobiplab1.lab1.repository;

import infobiplab1.lab1.Model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
