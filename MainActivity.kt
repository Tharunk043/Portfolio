package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the buttonSkills view
        val buttonSkills = findViewById<Button>(R.id.buttonSkills)

        // Set a click listener for the button
        buttonSkills.setOnClickListener {
            // Create an intent to start the SkillsActivity
            val intent = Intent(this@MainActivity, SkillsActivity::class.java)

            // Start the new activity
            startActivity(intent)
            //btn edu

    }
        val buttonEducation = findViewById<Button>(R.id.buttoneducation)

        // Set a click listener for the button
        buttonEducation.setOnClickListener {
            // Create an intent to start the SkillsActivity
            val intent = Intent(this@MainActivity, Educ::class.java)
            // Start the new activity
            startActivity(intent)

        }
        val buttonWork = findViewById<Button>(R.id.buttonwork)

        // Set a click listener for the button
        buttonWork.setOnClickListener {
            // Create an intent to start the SkillsActivity
            val intent = Intent(this@MainActivity, WorkActivity::class.java)
            // Start the new activity
            startActivity(intent)

        }
        val buttonAch = findViewById<Button>(R.id.buttoneAchievements)

        // Set a click listener for the button
        buttonAch.setOnClickListener {
            // Create an intent to start the SkillsActivity
            val intent = Intent(this@MainActivity, AchievementsActivity::class.java)
            // Start the new activity
            startActivity(intent)

        }

}}