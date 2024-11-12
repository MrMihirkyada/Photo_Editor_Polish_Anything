//package com.example.photoeditorpolishanything.Adapter
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import androidx.recyclerview.widget.RecyclerView
//import com.example.photoeditorpolishanything.R
//import com.example.photoeditorpolishanything.Utils.CollageModelClass.TemplateItem
//
//
//class CollageAdapter(private val collageItem : List<TemplateItem>) :
//    RecyclerView.Adapter<CollageAdapter.CollageViewHolder>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollageViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_collage, parent, false)
//        return CollageViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: CollageViewHolder, position: Int) {
//        val templateItem = collageItem[position]
//        holder.bind(templateItem)
//    }
//
//    override fun getItemCount() = collageItem.size
//
//    inner class CollageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        private val templateImageView: ImageView = itemView.findViewById(R.id.imageView)
//
//        fun bind(templateItem: TemplateItem) {
//            // Load the collage image from the `TemplateItem`
//            val imageResource = templateItem.getImageResource(templateItem.photoItemList)
//            templateImageView.setImageResource(imageResource)
//        }
//    }
//}