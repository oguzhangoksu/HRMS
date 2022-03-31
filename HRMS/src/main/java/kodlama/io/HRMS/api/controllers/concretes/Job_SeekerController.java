package kodlama.io.HRMS.api.controllers.concretes;


import kodlama.io.HRMS.Entities.concretes.Job_Seeker;
import kodlama.io.HRMS.business.absracts.Job_SeekerService;
import kodlama.io.HRMS.core.utilities.DataResult;
import kodlama.io.HRMS.core.utilities.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobseekers")
public class Job_SeekerController {
    private Job_SeekerService job_seekerService;

    @Autowired
    public Job_SeekerController(Job_SeekerService job_seekerService) {
        this.job_seekerService = job_seekerService;
    }


    @GetMapping("/getall")
    public DataResult<List<Job_Seeker>> getall(){
        return this.job_seekerService.getall();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Job_Seeker job_seeker){
        return this.job_seekerService.add(job_seeker);
    }
    @GetMapping("/getallByPage")
    public DataResult<List<Job_Seeker>> getall(int pageNo,int pageSize){
        return this.job_seekerService.getall(pageNo,pageSize);
    }
    @GetMapping("/getallDesc")
    public DataResult<List<Job_Seeker>> getallSorted(){
        return this.job_seekerService.getallSorted();
    }
    @GetMapping("/getByNameAndSurnameAndIdentityNumber")
    public DataResult<Job_Seeker> getByNameAndSurnameAndIdentityNumber(@RequestParam("name") String name,@RequestParam("surname") String surname, @RequestParam("identityNumber") String identity_number) {
        return this.job_seekerService.getByNameAndSurnameAndIdentityNumber(name,surname,identity_number);
    }
    @GetMapping("getByIdentityNumber")
    public DataResult<Job_Seeker> getByIdentityNumber(@RequestParam("identityNumber") String identity_number) {
        return this.job_seekerService.getByIdentityNumber(identity_number);
    }
    @GetMapping("getByName")
    public DataResult<List<Job_Seeker>> getByName(@RequestParam("name") String name) {
        return this.job_seekerService.getByName(name);
    }



    }