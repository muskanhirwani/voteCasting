package com.example.voteCaste;

import com.example.voteCaste.domain.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/candidates")
public class Controller {
@Autowired
private Service service;
    @PostMapping("/enterCandidate")
    public ResponseEntity<Candidate> createCandidatEntry(@RequestBody Candidate candidate)
    {

        Candidate createdCandidate = service.create(candidate);
        createdCandidate.getVoteCount();
        if (createdCandidate == null) {
            return ResponseEntity.notFound().build();

        } else {
            URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{/enterCandidate}").buildAndExpand((createdCandidate.getCandidateName())).toUri();

            return ResponseEntity.created(uri).body(createdCandidate);
        }



    }


    @PutMapping("/casteVote")

    public void casteVote(String candidateName)
    {





    }
    @GetMapping("/countVotes")
    public Candidate votes(String candidateName)
    {
       return
    }
//    @GetMapping("/listCandidate")
//    public JSONPObject list()
//    { String s="";
//        return JSONParser(s);
//    }
//    @GetMapping("/getWinner")
//    public  JSONPObject winner()
//    {
//        String winner="";
//        return winner;
//    }

}
