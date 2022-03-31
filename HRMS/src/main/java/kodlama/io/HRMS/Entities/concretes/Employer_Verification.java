package kodlama.io.HRMS.Entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="employer_verification")
@AllArgsConstructor
@NoArgsConstructor
public class Employer_Verification {

    @Id
    @GeneratedValue
    @Column(name="employer_verification_id")
    private int employerVerificationId;

    @ManyToOne
    @JoinColumn(name="employer_id")
    private Employer employer1;

    @ManyToOne
    @JoinColumn(name="email_verification_id")
    private Email_Verification emailVerification;




}
