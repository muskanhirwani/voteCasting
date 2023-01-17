package com.example.voteCaste;

import com.example.voteCaste.domain.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidates")
public class Controller {
    @Autowired
    private Service service;

    @PostMapping("/enterCandidate")
    public ResponseEntity<Candidate> createCandidatEntry(@RequestParam(name = "name") String name) throws Exception {
        service.create(name);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/casteVote")

    public Integer casteVote(@RequestParam(name = "name") String candidateName) {
        return service.casteVotes(candidateName);

    }

    @GetMapping("/countVotes")
    public Integer countVotes(@RequestParam(name = "name") String candidateName) {
        return service.countVotes(candidateName);
    }

    @GetMapping("/listVote")
    public List<Candidate> listOfCandidates() {
        return service.listOfCandidates;
    }

    @GetMapping("/getWinner")
    public String winner() {
        return service.findWinner();

    }

}
