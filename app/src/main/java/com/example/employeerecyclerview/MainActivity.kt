package com.example.employeerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val employees = mutableListOf(
        EmployeeDataModel(
            "Mohamed",
            "Mobile Developer"
            ,R.drawable.avatar
        ),
        EmployeeDataModel(
            "Ghadeer",
            "Mobile Developer"
            ,R.drawable.avatar_1
        ),
        EmployeeDataModel(
            "Moustafa",
            "Mobile Developer"
            ,R.drawable.avatar_2
        )
    )
    private lateinit var empRecyclerView: RecyclerView
    private lateinit var empAdapter: EmployeeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        empRecyclerView = findViewById(R.id.emp_recyclerview)
        empAdapter = EmployeeAdapter(employees)

        empRecyclerView.adapter = empAdapter
    }

}