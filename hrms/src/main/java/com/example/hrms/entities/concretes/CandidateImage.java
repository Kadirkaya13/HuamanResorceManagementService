package com.example.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="candidate_images")
@CrossOrigin
public class CandidateImage {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "url")
    private String url;

    @Column(name = "uploaded_at")
    private LocalDate uploadedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;
}
