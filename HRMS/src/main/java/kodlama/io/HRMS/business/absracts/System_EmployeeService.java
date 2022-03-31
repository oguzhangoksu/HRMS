package kodlama.io.HRMS.business.absracts;

import kodlama.io.HRMS.Entities.concretes.System_Employee;
import kodlama.io.HRMS.core.utilities.DataResult;
import kodlama.io.HRMS.core.utilities.Result;

import java.util.List;

public interface System_EmployeeService {
    DataResult<List<System_Employee>> getall();
    Result add(System_Employee system_employee);
}
