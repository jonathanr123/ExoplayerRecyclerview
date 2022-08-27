package com.example.exoplayer.adapter

import com.example.exoplayer.model.MediaObject
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import coil.load
import com.example.exoplayer.databinding.ItemMediaListBinding

class MediaRecyclerAdapter : ListAdapter<MediaObject, RecyclerView.ViewHolder> (DiffUtilCallback()) {

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val viewHolder: PlayerViewHolder = holder as PlayerViewHolder
        viewHolder.bind(getItem(position))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = ItemMediaListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return PlayerViewHolder(binding)
    }

    class PlayerViewHolder(private val binding: ItemMediaListBinding) :
        RecyclerView.ViewHolder(binding.cvVideo) {

        internal fun bind(
            value: MediaObject
        ) {
            binding.cvVideo.tag = this
            with(binding) {
                tvTitle.text = value.title
                tvUserHandle.text = value.userHandle
                ivMediaCoverImage.load(value.coverUrl)
                }
            }
        }

    class DiffUtilCallback : DiffUtil.ItemCallback<MediaObject>(){
        override fun areItemsTheSame(oldItem: MediaObject, newItem: MediaObject): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: MediaObject, newItem: MediaObject): Boolean {
            return oldItem.id == newItem.id
        }
    }
}