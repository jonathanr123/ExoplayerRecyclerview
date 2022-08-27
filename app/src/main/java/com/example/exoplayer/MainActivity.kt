package com.example.exoplayer

import androidx.appcompat.app.AppCompatActivity
import com.example.exoplayer.utils.ExoPlayerRecyclerView
import com.example.exoplayer.model.MediaObject
import com.example.exoplayer.adapter.MediaRecyclerAdapter
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.exoplayer.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    // Properties
    private lateinit var binding: ActivityMainBinding

    private lateinit var rvVideos: ExoPlayerRecyclerView
    private val adapterVideos = MediaRecyclerAdapter()
    private val mediaObjectList = ArrayList<MediaObject>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Prepare demo content
        prepareVideoList()

        // Init RecyclerView
        setUpRecyclerViewVideos()
    }

    private fun setUpRecyclerViewVideos() {
        rvVideos = binding.exoPlayerRecyclerView
        rvVideos.layoutManager = LinearLayoutManager(this)

        // Set data object
        rvVideos.setMediaObjects(mediaObjectList)
        adapterVideos.submitList(mediaObjectList)

        // Set Adapter
        rvVideos.adapter = adapterVideos
        rvVideos.smoothScrollToPosition(1)
    }

    override fun onDestroy() {
        rvVideos.releasePlayer()
        super.onDestroy()
    }

    override fun onPause() {
        rvVideos.onPausePlayer()
        super.onPause()
    }

    private fun prepareVideoList() {
        val mediaObject = MediaObject()
        mediaObject.id = 1
        mediaObject.userHandle = "User 1"
        mediaObject.title = "Item 1"
        mediaObject.coverUrl = "https://media.rawg.io/media/crop/600/400/games/5dd/5dd4d2dd986d2826800bc37fff64aa4f.jpg"
        mediaObject.url = "https://media.rawg.io/media/stories-640/1af/1af02ce32304129a25f9772895c07e19.mp4"
        val mediaObject2 = MediaObject()
        mediaObject2.id = 2
        mediaObject2.userHandle = "user 2"
        mediaObject2.title = "Item 2"
        mediaObject2.coverUrl = "https://media.rawg.io/media/resize/640/-/games/686/686909717c3aa01518bc42ae2bf4259e.jpg"
        mediaObject2.url = "https://media.rawg.io/media/stories-640/0b1/0b15bf3ea0cae759d1649b8873c1717e.mp4"
        val mediaObject3 = MediaObject()
        mediaObject3.id = 3
        mediaObject3.userHandle = "User 3"
        mediaObject3.title = "Item 3"
        mediaObject3.coverUrl = "https://media.rawg.io/media/crop/600/400/games/709/709bf81f874ce5d25d625b37b014cb63.jpg"
        mediaObject3.url = "https://media.rawg.io/media/stories-640/2f0/2f008813810fb64d5aa91e1db49b8d72.mp4"
        val mediaObject4 = MediaObject()
        mediaObject4.id = 4
        mediaObject4.userHandle = "User 4"
        mediaObject4.title = "Item 4"
        mediaObject4.coverUrl = "https://media.rawg.io/media/resize/640/-/games/909/909974d1c7863c2027241e265fe7011f.jpg"
        mediaObject4.url = "https://media.rawg.io/media/stories-640/953/9535840564f0aed755a9acf556f93fc4.mp4"
        val mediaObject5 = MediaObject()
        mediaObject5.id = 5
        mediaObject5.userHandle = "User 5"
        mediaObject5.title = "Item 5"
        mediaObject5.coverUrl = "https://media.rawg.io/media/crop/600/400/games/456/456dea5e1c7e3cd07060c14e96612001.jpg"
        mediaObject5.url = "https://media.rawg.io/media/stories-640/c10/c10ef05b12482e4d2c647c4e26138d5b.mp4"
        val mediaObject6 = MediaObject()
        mediaObject6.id = 6
        mediaObject6.userHandle = "User 6"
        mediaObject6.title = "Item 6"
        mediaObject6.coverUrl = "https://media.rawg.io/media/crop/600/400/games/8d6/8d69eb6c32ed6acfd75f82d532144993.jpg"
        mediaObject6.url = "https://media.rawg.io/media/stories-640/e7f/e7fe2f699bec33909f2b18e68f084110.mp4"
        val mediaObject7 = MediaObject()
        mediaObject7.id = 7
        mediaObject7.userHandle = "User 7"
        mediaObject7.title = "Item 7"
        mediaObject7.coverUrl = "https://media.rawg.io/media/resize/640/-/games/cd3/cd3c9c7d3e95cb1608fd6250f1b90b7a.jpg"
        mediaObject7.url = "https://media.rawg.io/media/stories-640/eb9/eb944d36a782e58fb0df1a4804379e26.mp4"
        val mediaObject8 = MediaObject()
        mediaObject8.id = 8
        mediaObject8.userHandle = "User 8"
        mediaObject8.title = "Item 8"
        mediaObject8.coverUrl = "https://media.rawg.io/media/resize/640/-/screenshots/7ef/7ef9b901a0cbc33d45092690b9ae521b.jpg"
        mediaObject8.url = "https://media.rawg.io/media/stories/d24/d24935c22314743aaa063a7507ab6e01.mp4"
        val mediaObject9 = MediaObject()
        mediaObject9.id = 9
        mediaObject9.userHandle = "User 9"
        mediaObject9.title = "Item 9"
        mediaObject9.coverUrl = "https://media.rawg.io/media/crop/600/400/games/26d/26d4437715bee60138dab4a7c8c59c92.jpg"
        mediaObject9.url = "https://media.rawg.io/media/stories-640/f78/f789c8011d52e0ffac76b11a88fabee7.mp4"
        val mediaObject10 = MediaObject()
        mediaObject10.id = 10
        mediaObject10.userHandle = "User 10"
        mediaObject10.title = "Item 10"
        mediaObject10.coverUrl = "https://media.rawg.io/media/crop/600/400/games/615/615e9fc0a325e0d87b84dad029b8b7b9.jpg"
        mediaObject10.url = "https://media.rawg.io/media/stories-640/137/137a7f48e982c0c4bace574fcb802468.mp4"
        mediaObjectList.add(mediaObject)
        mediaObjectList.add(mediaObject2)
        mediaObjectList.add(mediaObject3)
        mediaObjectList.add(mediaObject4)
        mediaObjectList.add(mediaObject5)
        mediaObjectList.add(mediaObject6)
        mediaObjectList.add(mediaObject7)
        mediaObjectList.add(mediaObject8)
        mediaObjectList.add(mediaObject9)
        mediaObjectList.add(mediaObject10)
    }
}