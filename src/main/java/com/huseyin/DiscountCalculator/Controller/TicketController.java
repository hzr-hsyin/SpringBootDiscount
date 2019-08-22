package com.huseyin.DiscountCalculator.Controller;

import com.huseyin.DiscountCalculator.Entities.Ticket;
import com.huseyin.DiscountCalculator.Repository.TicketRepository;
import com.huseyin.DiscountCalculator.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/discount")

public class TicketController {

    @Autowired
    TicketService ticketService;

    @GetMapping(value = "/discountlist")
    public ResponseEntity<List<Ticket>> ticketList(Model model) {

        model.addAttribute("discounts", ticketService.getAllTicket());

        return ResponseEntity.ok(ticketService.getAllTicket());
    }
    @GetMapping("/{discountid}")
    public @ResponseBody
    Ticket getTicketById(@PathVariable("discountid") Long ticketId) {

        return ticketService.getTicketById(ticketId);

    }

    @PostMapping
    public void saveTickets(@Valid @RequestBody Ticket ticket){

        ticketService.saveTicket(ticket);
    }
    @DeleteMapping("/{id}")
    public void deleteTickets(@PathVariable(value = "id", required = true) Long id){

        ticketService.deleteTicket(id);
    }

    @PutMapping ("/{id}")
    public void updateTickets(@PathVariable(value = "id", required = true)Long id, @Valid @RequestBody Ticket ticket){

        ticketService.updateTicket(id, ticket);
    }


   /* @GetMapping("/showticketprice/{ticketid}")
    public @ResponseBody
    Integer showTicketPrice(@PathVariable("ticketid") Long ticketId) {

        return ticketService.showTicketPrice(ticketId);

    }*/
    @RequestMapping(value="/random")

    public String createRandomCode() {

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String randomCode = buffer.toString();
        return randomCode;
    }

    @GetMapping("/showdiscountcode/{ticketid}")
    public @ResponseBody
    String showDiscountCode(@PathVariable("ticketid") Long ticketId) {

        return ticketService.showDiscountCode(ticketId);

    }
}
