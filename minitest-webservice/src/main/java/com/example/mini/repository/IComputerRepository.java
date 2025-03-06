package com.example.mini.repository;

import com.example.mini.model.Computer;
import org.springframework.data.repository.CrudRepository;



public interface IComputerRepository extends CrudRepository<Computer, Long > {
}
