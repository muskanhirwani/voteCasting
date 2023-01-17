package com.example.voteCaste.domain;


import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public abstract class Candidate {
     List<String> id;
    List<String> candidateName;
      List <Integer> voteCount= Arrays.asList(0);
}
