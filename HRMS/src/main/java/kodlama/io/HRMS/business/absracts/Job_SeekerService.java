package kodlama.io.HRMS.business.absracts;

import kodlama.io.HRMS.Entities.concretes.Job_Seeker;
import kodlama.io.HRMS.core.utilities.DataResult;
import kodlama.io.HRMS.core.utilities.Result;

import java.util.List;

public interface Job_SeekerService {
    DataResult<List<Job_Seeker>> getall();
    DataResult<List<Job_Seeker>> getall(int pageNo,int pageSize);
    DataResult<List<Job_Seeker>> getallSorted();

    Result add(Job_Seeker job_seeker);

    DataResult<Job_Seeker> getByNameAndSurnameAndIdentityNumber(String name , String surname, String identity_number);

    DataResult<Job_Seeker> getByIdentityNumber(String identity_number);

    DataResult<List<Job_Seeker>> getByName(String name);



}

