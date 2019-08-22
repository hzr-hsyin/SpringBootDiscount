package com.huseyin.DiscountCalculator.Service;

import com.huseyin.DiscountCalculator.Entities.Ticket;
import com.huseyin.DiscountCalculator.Repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TicketServiceImp implements TicketService{

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public List<Ticket> getAllTicket() {

        return ticketRepository.findAll();
    }

    @Override
    public Ticket getTicketById(long id) {

        return ticketRepository.findById(id).get();
    }

    @Override
    public void saveTicket(Ticket ticket) {

        ticketRepository.save(ticket);

    }
    @Override
    public void updateTicket(Long id, Ticket ticket) {

        ticketRepository.save(ticket);

    }

    @Override
    public void deleteTicket(long id) {

        ticketRepository.deleteById(id);

    }
/*
    @Override
    public Integer showTicketPrice(long id) {
        Ticket ticket = ticketRepository.findById(id).get();
        Integer ticketPrice = ticket.getTicketPrice();
        return ticketPrice;
}*/

    @Override
    public String showDiscountCode(long id) {
        Ticket ticket = ticketRepository.findById(id).get();
        String discountCode = ticket.getDiscountCode();
        return discountCode;
    }
    @Override
    public int showDiscountRate(long id) {
        Ticket ticket = ticketRepository.findById(id).get();
        int discountRate = ticket.getDiscountRate();
        return discountRate;
    }
    public String showDiscountDate(long id) {
        Ticket ticket = ticketRepository.findById(id).get();
        String discountDate = ticket.getDiscountDate();
        return discountDate;
    }

}
