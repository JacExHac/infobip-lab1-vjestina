package infobiplab1.lab1.Service;

import infobiplab1.lab1.Model.Worker;
import infobiplab1.lab1.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkerService {

    @Autowired
    private WorkerRepository workerRepository;
    public Worker getWorkerById(Long id) {
        Optional<Worker> worker = workerRepository.findById(id);

        if(worker.isPresent()) {
            return worker.get();
        } else {
            return null;
        }
    }

    public List<Worker> getAllWorkers() {
        return workerRepository.findAll();
    }

    public Worker addWorker(Worker worker) {
        return workerRepository.save(worker);
    }
}
