package com.example.demo.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class Users (
    @Id
    var id: Long,

    @Column
    var userName: String,

    @Column
    var groupName:String,

    @Column
    var isEnable:Boolean

)