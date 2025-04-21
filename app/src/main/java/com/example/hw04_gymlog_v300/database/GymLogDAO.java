package com.example.hw04_gymlog_v300.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.hw04_gymlog_v300.database.entities.GymLog;


import java.util.List;

@Dao
public interface GymLogDAO {

    /**
     * Adds a GymLog into database
     * @param gymlog
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(GymLog gymlog);

    /**
     * Returns all gym logs in database by date in descending order
     * @return all gym logs
     */
    @Query("SELECT * FROM " + GymLogDatabase.GYM_LOG_TABLE + " ORDER BY date DESC")
    List<GymLog> getAllRecords();

    /**
     * Returns all gym logs from logged in user by date in descending order
     * @param loggedInUserId
     * @return logged in user's gymlogs
     */
    @Query("SELECT * FROM " + GymLogDatabase.GYM_LOG_TABLE + " WHERE userId = :loggedInUserId ORDER BY date DESC")
    List<GymLog> getRecordsByUserId(int loggedInUserId);

    /**
     * Returns all logs for a user as LiveData auto updates UI
     * @param loggedInUserId
     * @return LiveData list of gymlogs from a user
     */
    @Query("SELECT * FROM " + GymLogDatabase.GYM_LOG_TABLE + " WHERE userId = :loggedInUserId ORDER BY date DESC")
    LiveData<List<GymLog>> getRecordsetUserIdLiveData(int loggedInUserId);
}
