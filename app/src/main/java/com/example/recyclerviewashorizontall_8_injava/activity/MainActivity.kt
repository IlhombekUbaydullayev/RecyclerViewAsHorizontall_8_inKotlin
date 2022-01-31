package com.example.recyclerviewashorizontall_8_injava.activity

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import com.example.recyclerviewashorizontall_8_injava.R
import com.example.recyclerviewashorizontall_8_injava.activity.adapter.CustomAdapter.CustomViewHolder
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewashorizontall_8_injava.activity.adapter.CustomAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewashorizontall_8_injava.activity.model.Member
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private var context: Context? = null
    private var recyclerView: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        val members = prepareMemerList()
        refreshAdapter(members)
    }

    private fun prepareMemerList(): List<Member> {
        val members : ArrayList<Member> = ArrayList()
        for (i in 0..29) {
            members.add(Member("Ilhombek$i", "Ubaydullayev$i"))
        }
        return members
    }

    private fun refreshAdapter(members: List<Member>) {
        val adapter = CustomAdapter(this, members)
        recyclerView!!.setAdapter(adapter)
    }

    private fun initView() {
        context = this
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView!!.setLayoutManager(LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false))
    }
}