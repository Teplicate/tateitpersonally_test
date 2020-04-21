package ru.teplicate.testapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ImageView
import androidx.core.content.ContextCompat

class ImageSpinnerAdapter(context: Context) : BaseAdapter() {
    override fun getItem(p0: Int): Any {
        return Unit
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return 3
    }

    private val flagIds = arrayOf(R.drawable.deutch_icon, R.drawable.jp_icon, R.drawable.uk_icon)
    private var inflater: LayoutInflater = LayoutInflater.from(context)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return getImageView(position, convertView, parent)
    }

    private fun getImageView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: inflater.inflate(R.layout.spinner_item, null)
        view.findViewById<ImageView>(R.id.countryFlag).background = ContextCompat.getDrawable(
            parent!!.context, flagIds[position]
        )

        return view
    }
}