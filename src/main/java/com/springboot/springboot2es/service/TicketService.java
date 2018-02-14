package com.springboot.springboot2es.service;

import com.springboot.springboot2es.domain.Ticket;
import com.springboot.springboot2es.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional
public class TicketService {

    private int AMOUNT_LOG = 10000;

    @Autowired
    private TicketRepository ticketRepository;


    public void createAndSaveTicketsLogs() throws InterruptedException {

        ArrayList<Ticket> tickets = new ArrayList<>();
        for (int i = 0; i < AMOUNT_LOG; i++) {
            tickets.add(new Ticket().generateTicket(i));
           // ticketRepository.save(new Ticket().generateTicket(i));
        }
        ticketRepository.saveAll(tickets);
    }
}
