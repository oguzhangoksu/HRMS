package kodlama.io.HRMS.business.absracts;

import kodlama.io.HRMS.Entities.concretes.Employer;
import kodlama.io.HRMS.Entities.concretes.System_Employee;
import kodlama.io.HRMS.core.utilities.DataResult;
import kodlama.io.HRMS.core.utilities.Result;

import java.util.List;

public interface Employer_Service {
    DataResult<List<Employer>> getall();
    Result add(Employer employer);
}
