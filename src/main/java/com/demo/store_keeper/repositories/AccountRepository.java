package com.demo.store_keeper.repositories;

import com.demo.store_keeper.domains.Employee_Info;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Employee_Info, Long> {

}
