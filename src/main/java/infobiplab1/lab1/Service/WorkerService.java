package infobiplab1.lab1.Service;

import infobiplab1.lab1.Model.Worker;
import infobiplab1.lab1.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {

    @Autowired
    private WorkerRepository workerRepository;
    public Worker getWorkerById(Long id) {
        return workerRepository.getById(id);
    }

    public List<Worker> getAllWorkers() {
        return workerRepository.findAll();
    }
}
