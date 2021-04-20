package com.globomantics.runtasticcodingcontest

import androidx.recyclerview.widget.RecyclerView
import androidx.fragment.app.Fragment
import android.widget.*
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.globomantics.runtasticcodingcontest.dummy.DummyContent.DummyItem

/**
 * [RecyclerView.Adapter] that can display a [DummyItem].
 * TODO: Replace the implementation with code for your data type.
 */
class MyGroupRecyclerViewAdapter(
    private val values: List<DummyItem>,
    private val act: FragmentActivity?
) : RecyclerView.Adapter<MyGroupRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_group, parent, false)



        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.idView.text = item.id
        holder.contentView.text = item.content
        holder.buttonId.setOnClickListener{
            onToMembersClick()
        }
    }

    override fun getItemCount(): Int = values.size

    fun onToMembersClick(){
        val action = GroupFragmentDirections.actionGroupFragmentToMemberFragment()
        act?.findNavController(R.id.nav_container)?.navigate(action)
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val idView: TextView = view.findViewById(R.id.item_number)
        val contentView: TextView = view.findViewById(R.id.content)
        val buttonId: Button = view.findViewById(R.id.buttonId)

        override fun toString(): String {
            return super.toString() + " '" + contentView.text + "'"
        }
    }


}