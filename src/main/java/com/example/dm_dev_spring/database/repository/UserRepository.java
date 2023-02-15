package com.example.dm_dev_spring.database.repository;

import com.example.dm_dev_spring.database.pool.ConnectionPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    @Autowired
    private ConnectionPool connectionPool;
}
