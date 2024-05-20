package com.example.secondapp

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.PopupWindow
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainApp : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var backButton: Button
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var profileDisplay: ImageView
    private lateinit var showPopupInstruct: ImageButton//popup
    //fragments
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_app)

        showPopupInstruct = findViewById(R.id.infobutton)
        showPopupInstruct.setOnClickListener {
            showPopup()
        }

        textView = findViewById(R.id.username_display)
        backButton = findViewById(R.id.back_button)
        profileDisplay = findViewById(R.id.profile_display) // Initialize profileDisplay

        //fragments
        viewPager = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabLayout)

        //fragment
        val adapter = ViewPagerAdapter(this)
        adapter.addFragment(MoviesFragment(), "Movies")
        adapter.addFragment(SeriesFragment(), "Series")

        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = adapter.getPageTitle(position)
        }.attach()

        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val username = sharedPreferences.getString("username","")

        textView.text = username

        // Retrieve selected profile image ID from SharedPreferences
        val selectedProfileId = sharedPreferences.getInt("selectedProfile", -1)

        // Set the profile image in the profile display ImageView
        if (selectedProfileId != -1) {
            profileDisplay.setImageResource(selectedProfileId)
        }

        backButton.setOnClickListener{
            finish()
        }


    }
    private fun showPopup() {

        val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val popupView = inflater.inflate(R.layout.popup, null)

        val width = 800
        val height = 1500

        val instructWindow = PopupWindow(popupView, width, height, true)
        instructWindow.showAtLocation (popupView, Gravity.CENTER, 20, 100)

        val closeButton = popupView.findViewById<Button>(R.id.closeButton)
        closeButton.setOnClickListener {
            instructWindow.dismiss()
        }
    }

    class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

        private val fragments = ArrayList<Fragment>()
        private val fragmentTitles = ArrayList<String>()

        fun addFragment(fragment: Fragment, title: String) {
            fragments.add(fragment)
            fragmentTitles.add(title)
        }

        override fun getItemCount(): Int = fragments.size

        override fun createFragment(position: Int): Fragment = fragments[position]

        fun getPageTitle(position: Int): String = fragmentTitles[position]
    }
}


