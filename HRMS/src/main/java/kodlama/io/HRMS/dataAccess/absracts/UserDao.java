package kodlama.io.HRMS.dataAccess.absracts;

import kodlama.io.HRMS.Entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {




}
