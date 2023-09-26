package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter (private val number : Array<Int>): RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>()/* Step 3a: Provide Adapter Parent */ {
    //Step 3b: Complete function definitions for adapter

    class NumberViewHolder (val _textView: TextView) : RecyclerView.ViewHolder (_textView) {
        val imageView = _textView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        return NumberViewHolder(
           TextView(
               parent.context
           ).apply {
               layoutParams =ViewGroup.LayoutParams(300,300)
           }

           )
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        return

    }



}