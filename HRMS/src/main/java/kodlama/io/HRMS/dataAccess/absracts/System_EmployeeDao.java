package kodlama.io.HRMS.dataAccess.absracts;


import kodlama.io.HRMS.Entities.concretes.System_Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface System_EmployeeDao extends JpaRepository<System_Employee,Integer> {
}
