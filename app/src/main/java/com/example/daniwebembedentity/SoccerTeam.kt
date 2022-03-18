package com.example.daniwebembedentity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "soccer_team")
data class SoccerTeam(
    @PrimaryKey(autoGenerate = true) val id: Long,
    @Embedded(prefix = "head_coach_") val headCoach: HeadCoach
)
