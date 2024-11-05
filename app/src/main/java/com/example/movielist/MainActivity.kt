package com.example.movielist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var movieAdapter: MovieAdapter
    private val movieList = mutableListOf<Movie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rvMovieList)
        movieAdapter = MovieAdapter(this, movieList)
        recyclerView.layoutManager = GridLayoutManager(this, 3)
        recyclerView.adapter = movieAdapter

        prepareMovieListData()
    }

    private fun prepareMovieListData() {
        movieList.add(Movie("Bad & Crazy", R.drawable.bad_n_crazy))
        movieList.add(Movie("Gone Girl", R.drawable.gone_girl))
        movieList.add(Movie("Who Am I", R.drawable.who_am_i))
        movieList.add(Movie("A Haunting In Venice", R.drawable.a_haunting_in_venice))
        movieList.add(Movie("Crooked House", R.drawable.croooked_house))
        movieList.add(Movie("A Shop For Killers", R.drawable.a_shop_for_killers))
        movieList.add(Movie("Transformers : Dark Of The Moon", R.drawable.transformer_3))
        movieList.add(Movie("Murder On The Orient Express", R.drawable.murder_in_orient_express))
        movieList.add(Movie("Knights Of The Zodiac", R.drawable.knights_of_the_zodiac))


        movieAdapter.notifyDataSetChanged()
    }
}
