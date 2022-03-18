package com.example.daniwebembedentity

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface HeadCoachDao {
    @Insert
    suspend fun insert(coach: HeadCoach)

    @Query("SELECT * FROM head_coach")
    suspend fun getAll(): List<HeadCoach>

}