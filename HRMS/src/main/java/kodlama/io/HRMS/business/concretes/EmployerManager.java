package kodlama.io.HRMS.business.concretes;

import kodlama.io.HRMS.Entities.concretes.Employer;
import kodlama.io.HRMS.business.absracts.Employer_Service;
import kodlama.io.HRMS.core.utilities.DataResult;
import kodlama.io.HRMS.core.utilities.Result;
import kodlama.io.HRMS.core.utilities.SuccessDataResult;
import kodlama.io.HRMS.core.utilities.SuccessResult;
import kodlama.io.HRMS.dataAccess.absracts.EmployerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements Employer_Service {
    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao){
        this.employerDao=employerDao;
    }



    @Override
    public DataResult<List<Employer>> getall() {
        return new SuccessDataResult<List<Employer>>(employerDao.findAll(),"Data listed");
    }

    @Override
    public Result add(Employer employer) {
        employerDao.save(employer);
        return new SuccessResult("Data added");
    }
}
