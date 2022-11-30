package com.example.mytripapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvTrip: RecyclerView
    private var list: ArrayList<Trip> = arrayListOf()
    private var title: String = "MyTripApps HomePage"

//method awal
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvTrip = findViewById(R.id.rv_trip)
        rvTrip.setHasFixedSize(true)

        list.addAll(TripData.listData)
        showRecyclerList()

    }

//    Show List Home
    private fun showRecyclerList() {
        rvTrip.layoutManager = LinearLayoutManager(this)
        val listTripAdapter = ListTripAdapter(list)
        rvTrip.adapter = listTripAdapter

        listTripAdapter.setOnItemClickCallback(object : ListTripAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Trip) {
                showSelectedTrip(data)
            }
        })

    }


//    Selection Trip Option
    private fun showSelectedTrip(trip: Trip) {
        Toast.makeText(this, "Kamu memilih " + trip.name, Toast.LENGTH_SHORT).show()

    val moveWithDataIntent = Intent(this@MainActivity, DetailActivity::class.java)
    moveWithDataIntent.putExtra(DetailActivity.EXTRA_NAME, trip.name)
    moveWithDataIntent.putExtra(DetailActivity.EXTRA_DETAIL, trip.detail)
    moveWithDataIntent.putExtra(DetailActivity.EXTRA_PHOTO, trip.photo)
    startActivity(moveWithDataIntent)
}

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

//    MENU
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_home -> {
                title = "MyTripApps HomePage"
                showRecyclerList()

            }

            R.id.action_about -> {
                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntent)


            }
        }
        setActionBarTitle(title)
    }

}