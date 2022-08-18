package com.btnpld.betfair

import android.media.MediaPlayer
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.btnpld.betfair.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var mediaPlayer: MediaPlayer? = null

    private val list: ArrayList<Int> = ArrayList()
    private lateinit var buttons: List<ImageButton>
    private lateinit var cards: List<MemoryCard>
    var countDownTimer: CountDownTimer? = null
    private var indexOfSingleSelectedCard: Int? = null
    private var count = 1
    private var count1 = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mediaPlayer = MediaPlayer.create(this, R.raw.wwinner)

        loadButton()
        binding.btnNextLevel.setOnClickListener {
            count += 1
            binding.textLevel.text = "Level  ${count}"
            restartButtons()
            binding.btnNextLevel.visibility = View.INVISIBLE
            binding.btnNextLevel.isEnabled = false
            count1 = 1

        }
    }

    private fun loadButton() {
        for (i in 0..29) {
            list.add(R.drawable.photo_1 + i)
        }
        list.shuffle()
        val images = mutableListOf(list[1], list[2], list[3], list[4], list[5], list[6])

        images.addAll(images)
        images.shuffle()

        buttons = listOf(
            binding.btn1,
            binding.btn2,
            binding.btn3,
            binding.btn4,
            binding.btn5,
            binding.btn6,
            binding.btn7,
            binding.btn8,
            binding.btn9,
            binding.btn10,
            binding.btn11,
            binding.btn12
        )

        cards = buttons.indices.map { index ->
            MemoryCard(images[index])
        }
        buttons.forEachIndexed { index, button ->
            button.setOnClickListener {

                button.animate().rotationY(90f).setDuration(600).start()

                countDownTimer = object : CountDownTimer(800, 1000) {
                    override fun onTick(millisUntilFinished: Long) {
                    }

                    override fun onFinish() {
                        updateViews()
                        button.animate().rotationY(180f).setDuration(600).start()
                        button.background =
                            ContextCompat.getDrawable(this@MainActivity, images[index])
                    }
                }.start()
                updateModels(index)
            }
        }
    }

    private fun updateViews() {
        cards.forEachIndexed { index, card ->
            val button = buttons[index]
            if (card.isMatched) {

                countDownTimer = object : CountDownTimer(600, 1000) {
                    override fun onTick(millisUntilFinished: Long) {
                    }

                    override fun onFinish() {

                        button.animate().rotationY(133830f).setDuration(300).start()
                    }
                }.start()
            } else {
                button.background = ContextCompat.getDrawable(
                    this@MainActivity, if (card.isFaceUp) {
                        card.identifier
                    } else {
                        R.drawable.cardd
                    }
                )
            }
        }
    }

    private fun updateModels(position: Int) {
        val card = cards[position]
        if (card.isFaceUp) {
            return
        }
        if (indexOfSingleSelectedCard == null) {
            restoreCards()
            indexOfSingleSelectedCard = position
        } else {
            checkForMatch(indexOfSingleSelectedCard!!, position)
            indexOfSingleSelectedCard = null
        }
        card.isFaceUp = !card.isFaceUp
    }

    private fun restoreCards() {
        for (card in cards) {
            if (!card.isMatched) {
                card.isFaceUp = false
            }
        }
    }

    private fun checkForMatch(position1: Int, position2: Int) {
        if (cards[position1].identifier == cards[position2].identifier) {

            if (count1 == 6) {
                binding.btnNextLevel.visibility = View.VISIBLE
                binding.btnNextLevel.isEnabled = true
                count1 = 1
            }
            countDownTimer = object : CountDownTimer(800, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                }

                override fun onFinish() {

                    mediaPlayer!!.start()
                }
            }.start()
            count1++
            cards[position1].isMatched = true
            cards[position2].isMatched = true

        } else {
            countDownTimer = object : CountDownTimer(700, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                }

                override fun onFinish() {
                    restoreCards()
                }
            }.start()
        }
    }

    private fun restartButtons() {
        for (i in 0..29) {
            list.add(R.drawable.photo_1 + i)
        }
        list.shuffle()
        val images = mutableListOf(list[1], list[2], list[3], list[4], list[5], list[6])

        images.addAll(images)
        images.shuffle()

        buttons = listOf(
            binding.btn1,
            binding.btn2,
            binding.btn3,
            binding.btn4,
            binding.btn5,
            binding.btn6,
            binding.btn7,
            binding.btn8,
            binding.btn9,
            binding.btn10,
            binding.btn11,
            binding.btn12
        )

        buttons.forEachIndexed { index, button ->

            button.animate().rotationY(0f).setDuration(200).start()
            button.background = ContextCompat.getDrawable(this@MainActivity, R.drawable.cardd)
        }
        loadButton()
    }


}