package com.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

import kotlin.random.Random as KotlinRandomRandom

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Hamburger", "Pizza", "McDonalds")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val selectedFoodText: TextView = findViewById(R.id.selectedFoodText)



        selectedFoodText.text = "Chinese"
        val random = Random()

        val randomFood = random.nextInt(foodList.count())
        selectedFoodText.text = foodList[randomFood]


        val addfoodbtm: TextView = findViewById(R.id.foodbtm)


        val addFoodText: EditText = findViewById(R.id.FoodTxt)

        val addbotton2: Button = findViewById(R.id.button2)


        addbotton2.setOnClickListener{
            val newFood = addFoodText.text.toString()
            foodList.add(newFood)
            addFoodText.text.clear()
            println(foodList)}

        addfoodbtm.setOnClickListener{
            val randomFood = random.nextInt(foodList.count())
            selectedFoodText.text = foodList[randomFood]}


    }

}







