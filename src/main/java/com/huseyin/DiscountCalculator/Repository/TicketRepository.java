package com.huseyin.DiscountCalculator.Repository;

import com.huseyin.DiscountCalculator.Entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Long> {



}
