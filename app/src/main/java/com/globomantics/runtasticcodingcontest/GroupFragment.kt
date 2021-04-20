package com.globomantics.runtasticcodingcontest

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.globomantics.runtasticcodingcontest.dummy.DummyContent

/**
 * A fragment representing a list of Items.
 */
class GroupFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_group_list, container, false)

        // Set the adapter
        if (view is RecyclerView) {
            with(view) {
              adapter = MyGroupRecyclerViewAdapter(DummyContent.ITEMS, activity)
            }
          }
        return view
    }


}