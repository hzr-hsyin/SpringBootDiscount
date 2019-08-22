package com.huseyin.DiscountCalculator.Entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Tickets")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "discount_ID" )
    private Long discountId;

    @Column(name= "discount_code" )
    private String discountCode;


    public Ticket(String code, int discountRate,String discountDate) {
        this.discountCode=code;
        this.discountRate=discountRate;
        this.discountDate=discountDate;
    }

    public String getDiscountCode(){
        return discountCode;
    }

    @Column(name= "discount_rate" )
    private int discountRate;
    public Ticket(int discountRate){
        this.discountRate=discountRate;
    }
    public int getDiscountRate(){
        return discountRate;
    }

    @Column(name= "discount_date" )
    private String discountDate;
    public Ticket(String discountDate){
        this.discountDate=discountDate;
    }
    public String getDiscountDate(){
        return discountDate;
    }
}
