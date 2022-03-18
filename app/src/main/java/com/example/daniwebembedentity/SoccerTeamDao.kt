package com.example.daniwebembedentity

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface SoccerTeamDao {
    @Insert
    suspend fun insert(team: SoccerTeam)

    @Query("SELECT * FROM soccer_team")
    suspend fun getAll(): List<SoccerTeam>

}