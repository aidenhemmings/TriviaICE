package com.example.triviaice

data class Question(
    val type: String,
    val difficulty: String,
    val category: String,
    val question: String,
    val correct_answer: String,
    val incorrect_answers: List<String>
)

data class ApiResponse(
    val response_code: Int,
    val results: List<Question>
)