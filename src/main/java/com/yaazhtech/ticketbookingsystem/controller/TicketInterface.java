package com.yaazhtech.ticketbookingsystem.controller;

import com.yaazhtech.ticketbookingsystem.data.UserData;
import com.yaazhtech.ticketbookingsystem.model.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// TicketInterface = blueprint of what TicketController must implement
// Ensures consistency, readability, and easier testing
public interface TicketInterface {

    @PostMapping("/save")
    String userDetail(@RequestBody UserRequest userRequest);

    @GetMapping("/allUserId")
    List<UserData> getAllUserDetail();

    @GetMapping("/{id}")
    UserData getUserById(@PathVariable Long id);

    @DeleteMapping("/{id}")
    void deleteUserDetail(@PathVariable Long id);

    @PutMapping("/{id}")
    UserData updateUserDetail(@PathVariable Long id,
                              @RequestBody UserData updatedUserDetail);
}
