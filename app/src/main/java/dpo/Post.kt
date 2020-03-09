package dpo

class Post (
    val id: Long,
    val author: String,
    val content: String,
    val created: String,
    var likedByMe: Boolean = false,
    val likedCount: Long,
    var shared: Boolean = false,
    val sharedCount: Long,
    var comments: Boolean = false,
    val commentsCount: Long
)