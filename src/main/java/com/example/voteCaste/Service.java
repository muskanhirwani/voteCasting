package com.example.voteCaste;

import com.example.voteCaste.domain.Candidate;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@org.springframework.stereotype.Service
@Data
public class Service {
    public List<Candidate> listOfCandidates = new ArrayList<>();

    public void create(String name) throws Exception {

        Candidate candidate = new Candidate();
        candidate.setCandidateName(name);
        if (listOfCandidates.contains(candidate))
            throw new Exception("candidate already present");
        listOfCandidates.add(candidate);
//
    }

    public Integer countVotes(String candidateName) {
        int flag = 0;
        for (Candidate candidates : listOfCandidates) {

            if (candidates.getCandidateName().equals(candidateName)) {
                flag = 1;
                return candidates.getVoteCount();
            }

        }
        if (flag == 0) {
            throw new NoSuchElementException();
        }
        return 0;
    }

    public String findWinner() {
        Integer max = 0;
        String name = "";
        for (Candidate candidates : listOfCandidates) {
            if (Integer.max(max, candidates.getVoteCount()) != max) ;
            {
                max = Integer.max(max, candidates.getVoteCount());
                name = candidates.getCandidateName();
            }
        }
        return name;
    }

    public Integer casteVotes(String candidateName) {
        int flag = 0;
        int voteCount = 0;
        for (Candidate candidates : listOfCandidates) {
            if (candidates.getCandidateName().equalsIgnoreCase(candidateName)) {
                flag = 1;
                candidates.setVoteCount(candidates.getVoteCount() + 1);
                voteCount = candidates.getVoteCount();
            }
            if (flag == 0) {
                throw new NoSuchElementException();
            }
        }
        return voteCount;
    }
}
