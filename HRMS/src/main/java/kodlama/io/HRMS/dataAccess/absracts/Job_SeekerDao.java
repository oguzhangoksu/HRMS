package kodlama.io.HRMS.dataAccess.absracts;


import kodlama.io.HRMS.Entities.concretes.Job_Seeker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Job_SeekerDao extends JpaRepository<Job_Seeker,Integer> {

    Job_Seeker getByNameAndSurnameAndIdentityNumber(String name , String surname, String identity_number);
    Job_Seeker getByIdentityNumber(String identity_number);
    List<Job_Seeker> getByName(String name);


}
