package kodlama.io.HRMS.Entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name="job_seeker")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobSeekerVerifications"})


public class Job_Seeker {
    @Id
    @GeneratedValue
    @Column(name="job_seeker_id")
    private int jobSeekerId;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "identity_number")
    private String identityNumber;

    @Temporal(TemporalType.DATE)
    @Column(name = "birth_date")
    private Date birthDate;




    @ManyToOne
    @JoinColumn(name="user_id")
    private User user1;

    @OneToMany(mappedBy = "jobSeeker")
    private List<Job_Seeker_Verification> jobSeekerVerifications;



}
