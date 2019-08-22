package com.huseyin.DiscountCalculator.Controller;

import com.huseyin.DiscountCalculator.Entities.Ticket;
import com.huseyin.DiscountCalculator.Repository.TicketRepository;
import com.huseyin.DiscountCalculator.Service.TicketServiceImp;
import org.aspectj.asm.IModelFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sun.util.calendar.BaseCalendar;

import java.util.Date;
import java.util.Random;

@Controller
public class DiscountCodeController {

    private String code ;
    private int discountRate;
    private String discountDate;
    TicketRepository repository;

    @Autowired
    TicketServiceImp ticketServiceImp;

    @RequestMapping("/")
    public String index() {
        return "index";
    }
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
    public int createRandomRate(){
        Random random=new Random();
        int discountRate=random.nextInt(10)+10;
        return discountRate;
    }

  // KOD URETİP KAYIT ETME


    @PostMapping("/yourdiscountcode")
    @ModelAttribute
    public String showYourDiscountCode(@RequestParam("date") String discountDate, Model model) {

        code = createRandomCode();
        discountRate=createRandomRate();
        //this.discountDate=ticket.getDiscountDate();
        model.addAttribute("yourdiscountcode",code);
        model.addAttribute("yourdiscountrate",discountRate);
        model.addAttribute("date",discountDate);
        ticketServiceImp.saveTicket(new Ticket(code,discountRate,discountDate));
        return "yourdiscountcode";
    }
    @Bean
    CommandLineRunner runner(TicketRepository repository){
        return args -> {

            String a=discountDate;
           // repository.save(new Ticket(code,discountRate,discountDate));

        };
    }

    @PostMapping("/usediscount")
    public String useDiscount(Model model){
        return "usediscount";
    }
    @PostMapping("/applydiscount")
    public String applyDiscount(Model model){
        model.addAttribute( "yourdiscountrate", discountRate);
        return "applydiscount";
    }
}
