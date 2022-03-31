package kodlama.io.HRMS.business.concretes;

import kodlama.io.HRMS.Entities.concretes.User;
import kodlama.io.HRMS.business.absracts.UserService;
import kodlama.io.HRMS.core.utilities.DataResult;
import kodlama.io.HRMS.core.utilities.Result;

import kodlama.io.HRMS.core.utilities.SuccessDataResult;
import kodlama.io.HRMS.core.utilities.SuccessResult;
import kodlama.io.HRMS.dataAccess.absracts.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserManager implements UserService {
    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao){
        super();
        this.userDao=userDao;
    }




    @Override
    public DataResult<List<User>> getall() {
        return new SuccessDataResult<List<User>>(userDao.findAll(),"Data Listed");
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Data added");
    }


}
