package com.example.daniwebembedentity

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [SoccerTeam::class, HeadCoach::class], version = 1)
abstract class MyDatabase : RoomDatabase() {
    abstract fun soccerTeamDao(): SoccerTeamDao
    abstract fun headCoachDao(): HeadCoachDao
}