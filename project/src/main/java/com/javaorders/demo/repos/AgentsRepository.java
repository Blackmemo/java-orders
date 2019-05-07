package com.javaorders.demo.repos;

import com.javaorders.demo.model.Agents;
import org.springframework.data.repository.CrudRepository;

public interface AgentsRepository extends CrudRepository<Agents, Long>
{
}
