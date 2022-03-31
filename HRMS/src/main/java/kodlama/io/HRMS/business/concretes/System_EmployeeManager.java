package kodlama.io.HRMS.business.concretes;

import kodlama.io.HRMS.Entities.concretes.System_Employee;
import kodlama.io.HRMS.business.absracts.System_EmployeeService;
import kodlama.io.HRMS.core.utilities.DataResult;
import kodlama.io.HRMS.core.utilities.Result;
import kodlama.io.HRMS.core.utilities.SuccessDataResult;
import kodlama.io.HRMS.core.utilities.SuccessResult;
import kodlama.io.HRMS.dataAccess.absracts.System_EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class System_EmployeeManager implements System_EmployeeService {
    private System_EmployeeDao system_employeeDao;

    @Autowired
    public System_EmployeeManager(System_EmployeeDao system_employeeDao){
        super();
        this.system_employeeDao = system_employeeDao;

    }




    @Override
    public DataResult<List<System_Employee>> getall() {
        return new SuccessDataResult<List<System_Employee>>(system_employeeDao.findAll(),"Data listed");
    }

    @Override
    public Result add(System_Employee system_employee) {
        this.system_employeeDao.save(system_employee);
        return new SuccessResult("Data added");
    }
}
