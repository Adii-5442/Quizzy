package com.example.quizzy

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat
import org.w3c.dom.Text

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {
    private var mCurrentPos:Int = 0
    private var mQuestionList:ArrayList<Question>? = null
    private var mSelectedOption:Int? = 0


    private var progressbar1 : ProgressBar? = null
    private  var progressbar2 : ProgressBar?= null
    private var tvQuestion: TextView? = null
    private var tvimage : ImageView? = null

    private var tvOPtionOne: TextView? = null
    private var tvOPtionTwo: TextView? = null
    private var tvOPtionThree: TextView? = null
    private var tvOPtionFour: TextView? = null

    private var btnSubmit : Button? = null






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        progressbar1 = findViewById(R.id.progressBar)
        progressbar2 = findViewById(R.id.progressBar2)
        tvQuestion = findViewById(R.id.tv_question)
        tvimage = findViewById(R.id.iv_image)
        tvOPtionOne = findViewById(R.id.option1)
        tvOPtionTwo = findViewById(R.id.option2)
        tvOPtionThree = findViewById(R.id.option3)
        tvOPtionFour = findViewById(R.id.option4)
        btnSubmit = findViewById(R.id.proceedBtn)
        mQuestionList = Constants.getQuestions()

        tvOPtionOne?.setOnClickListener(this)
        tvOPtionTwo?.setOnClickListener(this)
        tvOPtionThree?.setOnClickListener(this)
        tvOPtionFour?.setOnClickListener(this)
        btnSubmit?.setOnClickListener(this)

        setQuestion()
    }

    private fun setQuestion() {
        val question: Question = mQuestionList!![mCurrentPos]
        tvimage?.setImageResource(question.image)
        tvQuestion?.text = question.question
        tvOPtionOne?.text = question.optionOne
        tvOPtionTwo?.text = question.optionTwo
        tvOPtionThree?.text = question.optionThree
        tvOPtionFour?.text = question.optionFour
        //progressbar1?.indeterminateTintList

        if(mCurrentPos == mQuestionList!!.size){
            btnSubmit?.text = "Finish"
        }else{
            btnSubmit?.text = "Proceed"
        }

    }
    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        tvOPtionOne?.let { options.add(0,it) }
        tvOPtionTwo?.let { options.add(1,it) }
        tvOPtionThree?.let { options.add(2,it) }
        tvOPtionFour?.let { options.add(3,it) }

        for(option in options){
            option.typeface = Typeface.DEFAULT
//            option.background = ContextCompat.getDrawable(
//                this,
//
//                R.drawable.selected_option_border_bg
//
//            )
        }

    }

    private fun selectedOptionView(tv: TextView,selectedOptionNum:Int){
        defaultOptionsView()

        mSelectedOption = selectedOptionNum
        tv.setTextColor((Color.parseColor("#00FFFF")))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg
        )
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.option1->{
                tvOPtionOne?.let {
                    selectedOptionView(it, 1)
                }
            }
            R.id.option2->{
                tvOPtionTwo?.let {
                    selectedOptionView(it, 2)
                }
            }
            R.id.option3->{
                tvOPtionThree?.let {
                    selectedOptionView(it, 3)
                }
            }
            R.id.option4->{
                tvOPtionFour?.let {
                    selectedOptionView(it, 4)
                }
            }
            R.id.btn_submit ->{
                //TODO "implement btn submit"
            }

        }

    }


}