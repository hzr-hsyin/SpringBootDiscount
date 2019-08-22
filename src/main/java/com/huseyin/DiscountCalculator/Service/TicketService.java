package com.huseyin.DiscountCalculator.Service;

import com.huseyin.DiscountCalculator.Entities.Ticket;

import java.util.List;

public interface TicketService {

    public List<Ticket> getAllTicket();

    public Ticket getTicketById(long id);

    public void saveTicket(Ticket ticket);

    public void updateTicket(Long id, Ticket ticket);

    public void deleteTicket(long id);

    //public Integer showTicketPrice(long id);

    public String showDiscountCode(long id);

    public int showDiscountRate(long id);

}
