package ru.netology.coroutines.dto

data class PostWithCommentsAndAuthors(
    val authors: Author,
    val post: Post,
    val comments: List<Comment>,

)
