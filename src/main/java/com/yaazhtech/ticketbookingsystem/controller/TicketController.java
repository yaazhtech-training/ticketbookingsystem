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

    @PostMapping("/save")//comments line: endpoint
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
    @GetMapping("/{id}") // Maps HTTP GET requests to /employee/detail/{id}
    public UserData getUserById(@PathVariable Long id) {
        // @PathVariable binds URL path parameter {id} to method parameter
        // findById returns Optional; orElse(null) returns null if employee not found
        return userRepository.findById(id).orElse(null);
    }
    @DeleteMapping("/{id}") // Maps HTTP DELETE requests to /employee/detail/{id}
    public void deleteUserDetail(@PathVariable Long id) {
        // JPA repository method to delete entity by ID
        userRepository.deleteById(id);
    }
    @PutMapping("/{id}") // Maps HTTP PUT requests to /employee/detail/{id}
    public UserData updateUserDetail(@PathVariable Long id, @RequestBody UserData updatedUserDetail) {
        // Find existing employee from DB
        UserData existingUserDetail = userRepository.findById(id).orElse(null);

        // If employee exists, update fields
        if (existingUserDetail != null) {
            existingUserDetail.setUserId(updatedUserDetail.getUserId());
            existingUserDetail.setTheatreName(updatedUserDetail.getTheatreName());
            existingUserDetail.setSeatNumber(updatedUserDetail.getSeatNumber());
            existingUserDetail.setMobileNumber(updatedUserDetail.getMobileNumber());
            existingUserDetail.setShowTime(updatedUserDetail.getShowTime());
            existingUserDetail.setAmount(updatedUserDetail.getAmount());
        }

            // Save updated employee to DB and return updated entity
            return userRepository.save(existingUserDetail);

    }
}

















