package com.springboot.springboot2es.repository;

import com.springboot.springboot2es.domain.Ticket;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface TicketRepository extends ElasticsearchRepository<Ticket, String> {


}
