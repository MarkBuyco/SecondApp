package com.example.secondapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.content.Intent
import android.widget.ImageButton
import com.example.secondapp.R

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class MoviesFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movies, container, false)

        // Here are different intents that will navigate into different xml files.

        // Find the ImageButton by its ID
        val ant1Button = view.findViewById<ImageButton>(R.id.ant1)

        // Set OnClickListener to the ImageButton
        ant1Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, AntMan1::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val ant2Button = view.findViewById<ImageButton>(R.id.ant2)

        // Set OnClickListener to the ImageButton
        ant2Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, Antman2::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val ant3Button = view.findViewById<ImageButton>(R.id.ant3)

        // Set OnClickListener to the ImageButton
        ant3Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, AntMan3::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val avButton = view.findViewById<ImageButton>(R.id.avengers1)

        // Set OnClickListener to the ImageButton
        avButton.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, Avengers1::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val av2Button = view.findViewById<ImageButton>(R.id.avengers2)

        // Set OnClickListener to the ImageButton
        av2Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, Avengers2::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val av3Button = view.findViewById<ImageButton>(R.id.avengers3)

        // Set OnClickListener to the ImageButton
        av3Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, Avengers3::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val av4Button = view.findViewById<ImageButton>(R.id.avengers4)

        // Set OnClickListener to the ImageButton
        av4Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, Avengers4::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val cap1Button = view.findViewById<ImageButton>(R.id.cap)

        // Set OnClickListener to the ImageButton
        cap1Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, Cap1::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val cap2Button = view.findViewById<ImageButton>(R.id.cap2)

        // Set OnClickListener to the ImageButton
        cap2Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, Cap2::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val cap3Button = view.findViewById<ImageButton>(R.id.cap3)

        // Set OnClickListener to the ImageButton
        cap3Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, Cap3::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val capmarButton = view.findViewById<ImageButton>(R.id.capmar)

        // Set OnClickListener to the ImageButton
        capmarButton.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, Capmar::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val doc1Button = view.findViewById<ImageButton>(R.id.doctor1)

        // Set OnClickListener to the ImageButton
        doc1Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, doc1::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val doc2Button = view.findViewById<ImageButton>(R.id.doctor2)

        // Set OnClickListener to the ImageButton
        doc2Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, doc2::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val eternalButton = view.findViewById<ImageButton>(R.id.eternals)

        // Set OnClickListener to the ImageButton
        eternalButton.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, eternal::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val gotg1Button = view.findViewById<ImageButton>(R.id.gotg)

        // Set OnClickListener to the ImageButton
        gotg1Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, gotg1::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val gotg2Button = view.findViewById<ImageButton>(R.id.gotg2)

        // Set OnClickListener to the ImageButton
        gotg2Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, gotg2::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val gotg3Button = view.findViewById<ImageButton>(R.id.gotg3)

        // Set OnClickListener to the ImageButton
        gotg3Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, gotg3::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val iron1Button = view.findViewById<ImageButton>(R.id.iron1)

        // Set OnClickListener to the ImageButton
        iron1Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, iron1::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val iron2Button = view.findViewById<ImageButton>(R.id.iron2)

        // Set OnClickListener to the ImageButton
        iron2Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, iron2::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val iron3Button = view.findViewById<ImageButton>(R.id.iron3)

        // Set OnClickListener to the ImageButton
        iron3Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, iron3::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val marvelsButton = view.findViewById<ImageButton>(R.id.marvels)

        // Set OnClickListener to the ImageButton
        marvelsButton.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, marvels::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val panther1Button = view.findViewById<ImageButton>(R.id.panther)

        // Set OnClickListener to the ImageButton
        panther1Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, panther1::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val panther2Button = view.findViewById<ImageButton>(R.id.panther2)

        // Set OnClickListener to the ImageButton
        panther2Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, panther2::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val shangchiButton = view.findViewById<ImageButton>(R.id.shangchi)

        // Set OnClickListener to the ImageButton
        shangchiButton.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, shangchi::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val spider1Button = view.findViewById<ImageButton>(R.id.spider1)

        // Set OnClickListener to the ImageButton
        spider1Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, spider1::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val spider2Button = view.findViewById<ImageButton>(R.id.spider2)

        // Set OnClickListener to the ImageButton
        spider2Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, spider2::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val spider3Button = view.findViewById<ImageButton>(R.id.spider3)

        // Set OnClickListener to the ImageButton
        spider3Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, spider3::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val thor1Button = view.findViewById<ImageButton>(R.id.thor1)

        // Set OnClickListener to the ImageButton
        thor1Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, thor1::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val thor2Button = view.findViewById<ImageButton>(R.id.thor2)

        // Set OnClickListener to the ImageButton
        thor2Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, thor2::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val thor3Button = view.findViewById<ImageButton>(R.id.thor3)

        // Set OnClickListener to the ImageButton
        thor3Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, thor3::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val thor4Button = view.findViewById<ImageButton>(R.id.thor4)

        // Set OnClickListener to the ImageButton
        thor4Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, thor4::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val widowButton = view.findViewById<ImageButton>(R.id.widow)

        // Set OnClickListener to the ImageButton
        widowButton.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, widow::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val hulkButton = view.findViewById<ImageButton>(R.id.huulk)

        // Set OnClickListener to the ImageButton
        hulkButton.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, xhulk::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val deadButton = view.findViewById<ImageButton>(R.id.deadpool)

        // Set OnClickListener to the ImageButton
        deadButton.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, ydead::class.java)
            startActivity(intent)
        }

        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MoviesFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
