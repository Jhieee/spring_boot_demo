package com.example.demo.entity

interface UsersRepository {
    fun findAllBy(): List<Users>
}