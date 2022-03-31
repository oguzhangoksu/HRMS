package kodlama.io.HRMS.dataAccess.absracts;

import kodlama.io.HRMS.Entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer,Integer> {
}
