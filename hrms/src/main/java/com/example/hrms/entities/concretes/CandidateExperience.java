package com.example.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="candidate_experiences")
public class CandidateExperience {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "workplace_name")
    @NotNull
    @NotBlank
    private String workplaceName;

    @Column(name = "position")
    @NotNull
    @NotBlank
    private String position;

    @Column(name = "start_date")
    @NotNull
    @NotBlank
    private LocalDate startDate;

    @Column(name = "leave_date")
    private LocalDate leaveDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;
}
