package kodlama.io.HRMS.business.concretes;

import kodlama.io.HRMS.Entities.concretes.Job_Seeker;
import kodlama.io.HRMS.Entities.concretes.User;
import kodlama.io.HRMS.business.absracts.Job_SeekerService;
import kodlama.io.HRMS.core.utilities.*;
import kodlama.io.HRMS.dataAccess.absracts.Job_SeekerDao;
import kodlama.io.HRMS.dataAccess.absracts.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import kodlama.io.HRMS.core.utilities.SuccessDataResult;
import java.util.List;

@Service
public class Job_SeekerManager implements Job_SeekerService {
    private Job_SeekerDao job_seekerDao;

    @Autowired
    public Job_SeekerManager(Job_SeekerDao job_seekerDao){
        super();
        this.job_seekerDao=job_seekerDao;
    }


    @Override
    public DataResult<List<Job_Seeker>> getall() {
        return new SuccessDataResult<List<Job_Seeker>>(job_seekerDao.findAll(),"Data listed");
    }

    public DataResult<List<Job_Seeker>> getall(int pageNo,int pageSize) {
        Pageable pageable = PageRequest.of(pageNo-1,pageSize);
        return new SuccessDataResult<List<Job_Seeker>>(this.job_seekerDao.findAll(pageable).getContent());
    }

    public DataResult<List<Job_Seeker>> getallSorted(){
        Sort sort = Sort.by(Sort.Direction.DESC,"name");
        return new SuccessDataResult<List<Job_Seeker>>(this.job_seekerDao.findAll(sort),"Success");
    }


    @Override
    public Result add(Job_Seeker job_seeker) {
        this.job_seekerDao.save(job_seeker);
        return new SuccessResult("Data added");
    }

    @Override
    public DataResult<Job_Seeker> getByNameAndSurnameAndIdentityNumber(String name, String surname, String identity_number) {
        return new SuccessDataResult<Job_Seeker>(job_seekerDao.getByNameAndSurnameAndIdentityNumber(name,surname,identity_number),"Data listed");
    }

    @Override
    public DataResult<Job_Seeker> getByIdentityNumber(String identity_number) {
        return new SuccessDataResult<Job_Seeker>(job_seekerDao.getByIdentityNumber(identity_number),"Data Listed");
    }

    @Override
    public DataResult<List<Job_Seeker>> getByName(String name) {
        return new SuccessDataResult<List<Job_Seeker>>(job_seekerDao.getByName(name),"Data Listed");
    }
}









