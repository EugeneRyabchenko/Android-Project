package com.globomantics.runtasticcodingcontest

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.globomantics.runtasticcodingcontest.dummy.DummyContent

/**
 * A fragment representing a list of Items.
 */
class MemberFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_member_list, container, false)


        // Set the adapter
        if (view is RecyclerView) {
            with(view) {
                adapter = MyMemberRecyclerViewAdapter(DummyContent.ITEMS)
            }
        }
        return view
    }


}