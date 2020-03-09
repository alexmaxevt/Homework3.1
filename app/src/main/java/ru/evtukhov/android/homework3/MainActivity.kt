package ru.evtukhov.android.homework3

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import dpo.Post
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val post = Post(
        1,
        "Alex",
        "First post in our network!",
        "20 august 2019",
        false,
        50,
        false,
        8,
        false,
        20
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textViewDate.text = post.created
        content.text = post.content
        likeCount.text = post.likedCount.toString()

    }

    @SuppressLint("ResourceAsColor")
    fun likeClick(view: View) {
        post.likedByMe = true
        if (post.likedByMe) {
            likeBtn.setImageResource(R.drawable.ic_favorite_active_24dp)
            likeCount.setTextColor(R.color.colorActive)
            post.likedByMe = false
        }
    }

    @SuppressLint("ResourceAsColor")
    fun commentClick(view: View) {
        post.comments = true
        if (post.comments) {
            commentsBtn.setImageResource(R.drawable.ic_chat_active_24dp)
            commentsCount.setTextColor(R.color.colorActive)
            post.comments = false
        }
    }

    @SuppressLint("ResourceAsColor")
    fun shareClick(view: View) {
        post.shared = true
        if (post.shared) {
            shareBtn.setImageResource(R.drawable.ic_share_active_24dp)
            shareCount.setTextColor(R.color.colorActive)
            post.shared = false
        }
    }
}
