package com.example.voteCaste;
import com.example.voteCaste.domain.Candidate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public class ServiceTest {
    Service service;
    @Test(expected = Exception.class)
    public void testCreate() throws Exception {
        Candidate candidate = new Candidate();
        candidate.setCandidateName("muskan");
        List<Candidate> listOfCandidates = new ArrayList<>();

        service.create("muskan");
//        assertEquals();
    }

}
