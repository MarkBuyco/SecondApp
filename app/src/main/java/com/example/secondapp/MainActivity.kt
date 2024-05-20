    package com.example.secondapp

    import android.content.Context
    import android.content.Intent
    import android.content.SharedPreferences
    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.view.animation.AnimationUtils
    import android.widget.Button
    import android.widget.EditText
    import android.widget.ImageButton
    import android.widget.TextView

    class MainActivity : AppCompatActivity() {

        // variables
        private lateinit var editText: EditText
        private lateinit var saveButton: Button
        private lateinit var clearButton: Button
        private lateinit var sharedPreferences: SharedPreferences

        // Declare ImageButtons
        private lateinit var profile1: ImageButton
        private lateinit var profile2: ImageButton
        private lateinit var profile3: ImageButton
        private lateinit var profile4: ImageButton
        private lateinit var profile5: ImageButton
        private lateinit var profile6: ImageButton

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            //declaring attributes
            editText = findViewById(R.id.username)
            saveButton = findViewById(R.id.saved)
            clearButton = findViewById(R.id.clear)

            sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

            // Save the preferences
            saveButton.setOnClickListener{
                val inputText = editText.text.toString()
                val intent = Intent(this, MainApp::class.java)
                val editor = sharedPreferences.edit()
                editor.putString("username", inputText)
                editor.apply()
                startActivity(intent)
            }

            // Clear the the edit text
            clearButton.setOnClickListener{
                editText.text.clear()
            }

            // Initialize ImageButtons
            profile1 = findViewById(R.id.profile1)
            profile2 = findViewById(R.id.profile2)
            profile3 = findViewById(R.id.profile3)
            profile4 = findViewById(R.id.profile4)
            profile5 = findViewById(R.id.profile5)
            profile6 = findViewById(R.id.profile6)

            // Set click listeners for ImageButtons, with added animations
            profile1.setOnClickListener {
                stopAllAnimations()
                selectProfile(R.drawable.profile1)
                val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
                profile1.startAnimation(animation)
            }

            profile2.setOnClickListener {
                stopAllAnimations()
                selectProfile(R.drawable.profile2)
                val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
                profile2.startAnimation(animation)
            }

            profile3.setOnClickListener {
                stopAllAnimations()
                selectProfile(R.drawable.profile3)
                val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
                profile3.startAnimation(animation)
            }

            profile4.setOnClickListener {
                stopAllAnimations()
                selectProfile(R.drawable.profile4)
                val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
                profile4.startAnimation(animation)
            }

            profile5.setOnClickListener {
                stopAllAnimations()
                selectProfile(R.drawable.profile5)
                val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
                profile5.startAnimation(animation)
            }

            profile6.setOnClickListener {
                stopAllAnimations()
                selectProfile(R.drawable.profile6)
                val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
                profile6.startAnimation(animation)
            }

            val clickHereTextView = findViewById<TextView>(R.id.clickhere)
            clickHereTextView.setOnClickListener {
                val intent = Intent(this, MainApp::class.java)
                startActivity(intent)
            }
        }

        // shared preferences
        private fun selectProfile(profileId: Int) {
            // Save selected profile to SharedPreferences
            val editor = sharedPreferences.edit()
            editor.putInt("selectedProfile", profileId)
            editor.apply()
        }

        // Stop animations, if not selected
        private fun stopAllAnimations() {
            profile1.clearAnimation()
            profile2.clearAnimation()
            profile3.clearAnimation()
            profile4.clearAnimation()
            profile5.clearAnimation()
            profile6.clearAnimation()
        }
    }
