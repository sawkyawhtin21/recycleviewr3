package com.myogardener.recyclerview3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.myogardener.recyclerview3.abdater.PersonAdapter
import com.myogardener.recyclerview3.person.Person
import kotlinx.android.synthetic.main.recycleview.*

class MainActivity : AppCompatActivity(), PersonAdapter.ClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycleview)
        var personlist = ArrayList<Person>()
        personlist.add(Person(R.drawable.ic_food_delivery, "one"))
        personlist.add(Person(R.drawable.ic_food_delivery, "two"))
        personlist.add(Person(R.drawable.ic_food_delivery, "three"))
        personlist.add(Person(R.drawable.ic_food_delivery, "four"))
        personlist.add(Person(R.drawable.ic_food_delivery, "five"))
        personlist.add(Person(R.drawable.ic_food_delivery, "six"))
        personlist.add(Person(R.drawable.ic_food_delivery, "seven"))
        personlist.add(Person(R.drawable.ic_food_delivery, "eight"))
        personlist.add(Person(R.drawable.ic_food_delivery, "nine"))
        var personAdapter = PersonAdapter(personlist)
        recyclerView.layoutManager = GridLayoutManager(this, 3)
        recyclerView.adapter = personAdapter
        personAdapter.setOnClickListener(this)

    }

    override fun onClick(person: Person) {
        Toast.makeText(this, person.label, Toast.LENGTH_SHORT).show()
    }
}

