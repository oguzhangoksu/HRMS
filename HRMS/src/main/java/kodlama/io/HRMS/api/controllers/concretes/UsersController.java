package kodlama.io.HRMS.api.controllers.concretes;


import kodlama.io.HRMS.Entities.concretes.User;
import kodlama.io.HRMS.business.absracts.UserService;
import kodlama.io.HRMS.core.utilities.DataResult;
import kodlama.io.HRMS.core.utilities.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    private UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getall")
    public DataResult<List<User>> getall(){
        return this.userService.getall();
    }

    @PostMapping("/add")
    public Result add(@RequestBody User user){
        return this.userService.add(user);

    }
}
