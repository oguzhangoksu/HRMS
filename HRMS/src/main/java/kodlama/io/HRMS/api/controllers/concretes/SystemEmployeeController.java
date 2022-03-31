package kodlama.io.HRMS.api.controllers.concretes;

import kodlama.io.HRMS.Entities.concretes.System_Employee;
import kodlama.io.HRMS.Entities.concretes.User;
import kodlama.io.HRMS.business.absracts.System_EmployeeService;
import kodlama.io.HRMS.business.absracts.UserService;
import kodlama.io.HRMS.core.utilities.DataResult;
import kodlama.io.HRMS.core.utilities.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/systememployee")
public class SystemEmployeeController {
    private System_EmployeeService system_employeeService;

    @Autowired
    public SystemEmployeeController(System_EmployeeService system_employeeService) {
        this.system_employeeService = system_employeeService;
    }

    @GetMapping("/getall")
    public DataResult<List<System_Employee>> getall() {
        return this.system_employeeService.getall();
    }

    @PostMapping("/add")
    public Result add(@RequestBody System_Employee system_employee) {
        return this.system_employeeService.add(system_employee);

    }
}