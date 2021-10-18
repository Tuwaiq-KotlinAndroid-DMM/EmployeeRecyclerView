package com.example.employeerecyclerview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmployeeAdapter(val employees: List<EmployeeDataModel>) : RecyclerView.Adapter<EmpolyeeViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmpolyeeViewHolder {
        val item_layout_view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_layout,
            parent,
            false
        )
        Log.d("EmployeeAdapter" ,"onCreateViewHolder() Called")
        return EmpolyeeViewHolder(item_layout_view)
    }

    override fun onBindViewHolder(holder: EmpolyeeViewHolder, position: Int) {
        Log.d("EmployeeAdapter" ,"onBindViewHolder() Called Position: $position")

        holder.fullName.text = employees[position].fullName
        holder.jobTitle.text = employees[position].jobTitle
        holder.img.setImageResource(employees[position].img)

    }

    override fun getItemCount(): Int {
        return employees.size
    }

}

class EmpolyeeViewHolder(item_layout: View) : RecyclerView.ViewHolder(item_layout) {
    val fullName: TextView = item_layout.findViewById(R.id.fullname)
    val jobTitle: TextView = item_layout.findViewById(R.id.job_title)
    val img: ImageView = item_layout.findViewById(R.id.emp_img)
}