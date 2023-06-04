package hu.gde.runnersdemo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class SponsorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long sponsorId;
    private String sponsorName;
    @JsonIgnore
    @OneToMany
    private List<RunnerEntity>sponsoredRunners = new ArrayList<>();

    public long getSponsorId() {
        return sponsorId;
    }

    public void setSponsorId(long sponsorId) {
        this.sponsorId = sponsorId;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public List<RunnerEntity> getSponsoredRunners() {
        return sponsoredRunners;
    }

    public void setSponsoredRunners(List<RunnerEntity> sponsoredRunners) {
        this.sponsoredRunners = sponsoredRunners;
    }
}



