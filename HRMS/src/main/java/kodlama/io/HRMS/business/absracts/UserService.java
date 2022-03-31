package kodlama.io.HRMS.business.absracts;

import kodlama.io.HRMS.Entities.concretes.User;
import kodlama.io.HRMS.core.utilities.DataResult;
import kodlama.io.HRMS.core.utilities.Result;

import java.util.List;

public interface UserService {
    DataResult<List<User>> getall();
    Result add(User user);
}
