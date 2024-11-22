package sg.edu.nus.iss.vttp_day15_lecture.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.vttp_day15_lecture.repository.ListRepo;
import sg.edu.nus.iss.vttp_day15_lecture.repository.ValueRepo;

@Service
public class RedisTestService {

    @Autowired
    ListRepo listRepo;

    @Autowired
    ValueRepo valueRepo;

    ///Write service functions that operates with the above two types of repo
}
