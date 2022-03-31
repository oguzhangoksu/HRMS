package kodlama.io.HRMS.Entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="job_seeker_verification")
@AllArgsConstructor
@NoArgsConstructor
public class Job_Seeker_Verification {
    @Id
    @GeneratedValue
    @Column(name="job_seeker_verification_id")
    private int jobSeekerVerificationId;

    @ManyToOne
    @JoinColumn(name="job_seeker_id")
    private Job_Seeker jobSeeker;

    @ManyToOne
    @JoinColumn(name="email_verification_id")
    private Email_Verification emailVerification;

}
