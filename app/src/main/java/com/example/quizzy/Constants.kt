package com.example.quizzy

object Constants {

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            id = 1, question = "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "India",
            "Australia",
            "Germany",
            "Argentina",
            4,
            "00FFFF"

        )
        questionsList.add(que1)


        val que2 = Question(
            2,
            "Which country won FIFA 2018?",
            R.drawable.fifacup,
            "Argentina",
            "Brazil",
            "France",
            "Portugal",
            3,
            "#f0a70a"

        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "What is name of this animal?",
            R.drawable.koala,
            "Sloth",
            "Koala",
            "Mole",
            "Porcupine",
            2,
            "#302e29"

        )
        questionsList.add(que3)

        val que4 = Question(
            id = 4, question = "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Belgium",
            "Fiji",
            "Austria",
            "Morocco",
            4,
            "#b82737"

        )
        questionsList.add(que4)

        val que5 = Question(
            id = 5, question = "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Fiji",
            "Morocco",
            "Denmark",
            "Saudi-Arabia",
            3,
            "#db1f35"
        )
        questionsList.add(que5)






        return questionsList
    }



}