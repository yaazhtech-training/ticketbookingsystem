package com.yaazhtech.ticketbookingsystem.repository;

import com.yaazhtech.ticketbookingsystem.data.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserData, Long>{

}

