package com.example.movielist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter constructor(
    private val getActivity: MainActivity,
    private val movieList: List<Movie>) :

    RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_movie_list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: MyViewHolder,
        position: Int
    ) {
        holder.rvMovieTitle.text = movieList[position].title
        holder.rvMovieImg.setImageResource(movieList[position].image)
        holder.CardView.setOnClickListener{
            Toast.makeText(getActivity, movieList[position].title, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val rvMovieTitle : TextView = itemView.findViewById(R.id.rvMovieTitle)
        val rvMovieImg : ImageView = itemView.findViewById(R.id.rvMovieImg)
        val CardView : CardView = itemView.findViewById(R.id.CardView)

    }


}