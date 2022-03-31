package kodlama.io.HRMS.Entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="job_title")
@AllArgsConstructor
@NoArgsConstructor
public class Job_Title {

    @Id
    @GeneratedValue
    @Column(name="job_title_id")
    private int jobTitleId;

    @Column(name="job_position")
    private String job_Position;

    @Column(name="requirement")
    private String requirement;

    @Column(name="city")
    private String city;

    @Column(name="salary_scale")
    private String salaryScale;

    @Column(name="number_position")
    private int numberPosition;

    @Temporal(TemporalType.DATE)
    @Column(name="last_date")
    private Date lastDate;

}
