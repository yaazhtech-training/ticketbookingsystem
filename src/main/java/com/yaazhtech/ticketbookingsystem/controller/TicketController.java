package com.yaazhtech.ticketbookingsystem.controller;


import com.yaazhtech.ticketbookingsystem.model.UserId;
import com.yaazhtech.ticketbookingsystem.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/user/details")
public class TicketController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/save")
    public String userDetail(@RequestBody UserId userId){

    }
}
