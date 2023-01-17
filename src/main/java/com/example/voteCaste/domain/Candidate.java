package com.example.voteCaste.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Candidate {

    String candidateName;
    Integer voteCount = 0;
}
