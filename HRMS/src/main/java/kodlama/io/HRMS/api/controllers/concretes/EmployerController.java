package kodlama.io.HRMS.api.controllers.concretes;


import kodlama.io.HRMS.Entities.concretes.Employer;
import kodlama.io.HRMS.Entities.concretes.System_Employee;
import kodlama.io.HRMS.business.absracts.Employer_Service;
import kodlama.io.HRMS.business.absracts.System_EmployeeService;
import kodlama.io.HRMS.core.utilities.DataResult;
import kodlama.io.HRMS.core.utilities.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employer")
public class EmployerController {
    private Employer_Service employer_service;

    @Autowired
    public EmployerController(Employer_Service employer_service) {
        this.employer_service = employer_service;
    }

    @GetMapping("/getall")
    public DataResult<List<Employer>> getall() {
        return this.employer_service.getall();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Employer employer) {
        return this.employer_service.add(employer);

    }
}

