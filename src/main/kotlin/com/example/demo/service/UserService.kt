package com.example.demo.service

import com.example.demo.entity.Users
import com.example.demo.entity.UsersRepository
import org.springframework.stereotype.Service

@Service
class UserService  {
    lateinit var users: Users
    lateinit var usersRepository: UsersRepository

    fun get() {
        val result = usersRepository.findAllBy()
        print(result)
    }
}