package com.yaazhtech.ticketbookingsystem.controller;


import com.yaazhtech.ticketbookingsystem.data.UserData;
import com.yaazhtech.ticketbookingsystem.model.UserRequest;
import com.yaazhtech.ticketbookingsystem.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user/details")
public class TicketController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/save")
    public String userDetail(@RequestBody UserRequest userId) {
        UserData userData = new UserData();
        userData.setUserId(userId.getUserId());
        userData.setMovieName(userId.getMovieName());
        userData.setTheatreName(userId.getTheatreName());
        userData.setSeatNumber(userId.getMoblieNumber());
        userData.setMobileNumber(userId.getMoblieNumber());
        userData.setShowTime(userId.getShowTime());
        userRepository.save(userData);
        log.info("I am saved in repository");
        return "userdata has been saved successfully";

    }

    @GetMapping("/allUserId")
    public List<UserData> getAllUserDetail() {
        // Returns list of all employees from DB
        return userRepository.findAll();
    }
}














}

