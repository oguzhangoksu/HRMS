package kodlama.io.HRMS.Entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name="email_verification")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employerVerifications","hibernateLazyInitializer", "handler","jobSeekerVerifications"})

public class Email_Verification {

    @Id
    @GeneratedValue
    @Column(name="email_verification_id")
    private int emailVerificationId;

    @Column(name="email_verification_name")
    private String emailVerificationName;

    @Column(name="verification")
    private boolean verification;

    @Column(name="verification_date")
    private Date verificationDate;

    @OneToMany(mappedBy = "emailVerification")
    private List<Employer_Verification> employerVerifications;

    @OneToMany(mappedBy = "emailVerification")
    private List<Job_Seeker_Verification> jobSeekerVerifications;

}
