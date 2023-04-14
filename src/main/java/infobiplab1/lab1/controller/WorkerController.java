package infobiplab1.lab1.controller;

import infobiplab1.lab1.Model.Worker;
import infobiplab1.lab1.Service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController()
@RequestMapping("/workers")
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    @GetMapping("/{id}")
    public Worker getWorker(@PathVariable Long id) {
        return workerService.getWorkerById(id);
    }

    @GetMapping("")
    public List<Worker> getAllWorkers() {
        return workerService.getAllWorkers();
    }
}
