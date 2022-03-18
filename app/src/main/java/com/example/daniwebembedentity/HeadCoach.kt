package com.example.daniwebembedentity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "head_coach")
data class HeadCoach(
    @PrimaryKey(autoGenerate = true)  val id: Long,
    val name: String,
    val age: Int,
)
