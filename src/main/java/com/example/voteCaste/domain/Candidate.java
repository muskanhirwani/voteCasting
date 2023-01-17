package com.example.voteCaste.domain;


import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public abstract class Candidate {
     String id;
    String candidateName;
      Integer voteCount= 0;
}
