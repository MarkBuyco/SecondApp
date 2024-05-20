package com.example.secondapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class SeriesFragment : Fragment() {
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
        val view = inflater.inflate(R.layout.fragment_series, container, false)

        // Different intents to go to different xml files

        // Find the ImageButton by its ID
        val echoButton = view.findViewById<ImageButton>(R.id.echo)

        // Set OnClickListener to the ImageButton
        echoButton.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, echo::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val falconButton = view.findViewById<ImageButton>(R.id.falcon)

        // Set OnClickListener to the ImageButton
        falconButton.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, falcon::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val hawkButton = view.findViewById<ImageButton>(R.id.hawkeye)

        // Set OnClickListener to the ImageButton
        hawkButton.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, hawk::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val moonButton = view.findViewById<ImageButton>(R.id.moonknight)

        // Set OnClickListener to the ImageButton
        moonButton.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, moon::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val msmarvelButton = view.findViewById<ImageButton>(R.id.msmarvel)

        // Set OnClickListener to the ImageButton
        msmarvelButton.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, msmarvel::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val wandavisButton = view.findViewById<ImageButton>(R.id.wandavis)

        // Set OnClickListener to the ImageButton
        wandavisButton.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, wandavis::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val whatif1Button = view.findViewById<ImageButton>(R.id.whatif1)

        // Set OnClickListener to the ImageButton
        whatif1Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, whatif1::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val whatif2Button = view.findViewById<ImageButton>(R.id.whatif2)

        // Set OnClickListener to the ImageButton
        whatif2Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, whatif2::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val loki1Button = view.findViewById<ImageButton>(R.id.loki1)

        // Set OnClickListener to the ImageButton
        loki1Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, loki1::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val loki2Button = view.findViewById<ImageButton>(R.id.loki2)

        // Set OnClickListener to the ImageButton
        loki2Button.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, loki2::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val shehulkButton = view.findViewById<ImageButton>(R.id.shehulk)

        // Set OnClickListener to the ImageButton
        shehulkButton.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, shehulk::class.java)
            startActivity(intent)
        }

        // Find the ImageButton by its ID
        val secretButton = view.findViewById<ImageButton>(R.id.secret)

        // Set OnClickListener to the ImageButton
        secretButton.setOnClickListener {
            // Start a new activity
            val intent = Intent(activity, secret::class.java)
            startActivity(intent)
        }
        return view
    }


    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SeriesFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}