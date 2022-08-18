//package com.btnpld.betfair
//
//import android.os.Bundle
//import android.os.CountDownTimer
//import android.util.Log
//import android.widget.ImageButton
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.content.ContextCompat
//import com.btnpld.betfair.databinding.ActivityMainBinding
//
//class GameActivity {
//
//    private lateinit var binding: ActivityMainBinding
//    var countDownTimer: CountDownTimer? = null
//    var count = 0
//
//    private val list: ArrayList<Int> = ArrayList()
//    private val list1: ArrayList<Int> = ArrayList()
//    private val list2: ArrayList<Int> = ArrayList()
//    private val list3: ArrayList<Int> = ArrayList()
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        addList()
//
//        isActionMethod()
//    }
//
//    private fun isActionMethod() {
//
//        binding.btn1.setOnClickListener {
//
//            count++
//
//            if (count == 2) {
//                setVisible()
//
////                binding.btn1.animate().rotationY(90f).setDuration(800).start()
////
////                countDownTimer = object : CountDownTimer(800, 1000) {
////                    override fun onTick(millisUntilFinished: Long) {
////                    }
////
////                    override fun onFinish() {
////                        binding.btn1.animate().rotationY(180f).setDuration(800).start()
////                        binding.btn1.background =
////                            ContextCompat.getDrawable(this@MainActivity, R.drawable.ggg)
////                    }
////                }.start()
//
//            }
//            binding.btn1.animate().rotationY(90f).setDuration(800).start()
//
//            countDownTimer = object : CountDownTimer(800, 1000) {
//                override fun onTick(millisUntilFinished: Long) {
//                }
//
//                override fun onFinish() {
//                    binding.btn1.animate().rotationY(180f).setDuration(800).start()
//                    binding.btn1.background =
//                        ContextCompat.getDrawable(this@MainActivity, list3[1])
//                }
//            }.start()
//        }
//
//
//        binding.btn2.setOnClickListener {
//            count++
//
//            if (count == 2) {
//                setVisible()
//                if (list1[1] == list2[1]) {
//                    binding.btn1.animate().rotationY(-90f).setDuration(800).start()
//
//                    countDownTimer = object : CountDownTimer(800, 1000) {
//                        override fun onTick(millisUntilFinished: Long) {
//                        }
//
//                        override fun onFinish() {
//                            binding.btn1.animate().rotationY(-180f).setDuration(800).start()
//                            binding.btn1.background =
//                                ContextCompat.getDrawable(this@MainActivity, R.drawable.ggg)
//                        }
//                    }.start()
//                    binding.btn2.animate().rotationY(-90f).setDuration(800).start()
//
//                    countDownTimer = object : CountDownTimer(800, 1000) {
//                        override fun onTick(millisUntilFinished: Long) {
//                        }
//                        override fun onFinish() {
//                            binding.btn2.animate().rotationY(-180f).setDuration(800).start()
//                            binding.btn2.background =
//                                ContextCompat.getDrawable(this@MainActivity, R.drawable.ggg)
//                        }
//                    }.start()
//
//
//                }
//            }
//
//            binding.btn2.animate().rotationY(90f).setDuration(800).start()
//
//            countDownTimer = object : CountDownTimer(800, 1000) {
//                override fun onTick(millisUntilFinished: Long) {
//                }
//
//                override fun onFinish() {
//                    binding.btn2.animate().rotationY(180f).setDuration(800).start()
//                    binding.btn2.background =
//                        ContextCompat.getDrawable(this@MainActivity, list3[2])
//                }
//            }.start()
//        }
//
//
//        binding.btn3.setOnClickListener {
//            count++
//            if (count == 2) {
//                setVisible()
//            }
//
//            binding.btn3.animate().rotationY(90f).setDuration(800).start()
//
//            countDownTimer = object : CountDownTimer(800, 1000) {
//                override fun onTick(millisUntilFinished: Long) {
//                }
//
//                override fun onFinish() {
//                    binding.btn3.animate().rotationY(180f).setDuration(800).start()
//                    binding.btn3.background =
//                        ContextCompat.getDrawable(this@MainActivity, list3[3])
//                }
//            }.start()
//        }
//
//
//        binding.btn4.setOnClickListener {
//            count++
//            if (count == 2) {
//                setVisible()
//            }
//            binding.btn4.animate().rotationY(90f).setDuration(800).start()
//
//            countDownTimer = object : CountDownTimer(800, 1000) {
//                override fun onTick(millisUntilFinished: Long) {
//                }
//
//                override fun onFinish() {
//                    binding.btn4.animate().rotationY(180f).setDuration(800).start()
//                    binding.btn4.background =
//                        ContextCompat.getDrawable(this@MainActivity, list3[4])
//                }
//            }.start()
//        }
//
//
//        binding.btn5.setOnClickListener {
//            count++
//            if (count == 2) {
//                setVisible()
//            }
//            binding.btn5.animate().rotationY(90f).setDuration(800).start()
//
//            countDownTimer = object : CountDownTimer(800, 1000) {
//                override fun onTick(millisUntilFinished: Long) {
//                }
//
//                override fun onFinish() {
//                    binding.btn5.animate().rotationY(180f).setDuration(800).start()
//                    binding.btn5.background =
//                        ContextCompat.getDrawable(this@MainActivity, list3[5])
//                }
//            }.start()
//        }
//
//
//        binding.btn6.setOnClickListener {
//            count++
//            if (count == 2) {
//                setVisible()
//            }
//            binding.btn6.animate().rotationY(90f).setDuration(800).start()
//
//            countDownTimer = object : CountDownTimer(800, 1000) {
//                override fun onTick(millisUntilFinished: Long) {
//                }
//
//                override fun onFinish() {
//                    binding.btn6.animate().rotationY(180f).setDuration(800).start()
//                    binding.btn6.background =
//                        ContextCompat.getDrawable(this@MainActivity, list3[6])
//                }
//            }.start()
//        }
//
//
//        binding.btn7.setOnClickListener {
//            count++
//            if (count == 2) {
//                setVisible()
//            }
//            binding.btn7.animate().rotationY(90f).setDuration(800).start()
//
//            countDownTimer = object : CountDownTimer(800, 1000) {
//                override fun onTick(millisUntilFinished: Long) {
//                }
//
//                override fun onFinish() {
//                    binding.btn7.animate().rotationY(180f).setDuration(800).start()
//                    binding.btn7.background =
//                        ContextCompat.getDrawable(this@MainActivity, list3[7])
//                }
//            }.start()
//        }
//
//
//        binding.btn8.setOnClickListener {
//            count++
//            if (count == 2) {
//                setVisible()
//            }
//            binding.btn8.animate().rotationY(90f).setDuration(800).start()
//
//            countDownTimer = object : CountDownTimer(800, 1000) {
//                override fun onTick(millisUntilFinished: Long) {
//                }
//
//                override fun onFinish() {
//                    binding.btn8.animate().rotationY(180f).setDuration(800).start()
//                    binding.btn8.background =
//                        ContextCompat.getDrawable(this@MainActivity, list3[8])
//                }
//            }.start()
//        }
//
//
//        binding.btn9.setOnClickListener {
//            count++
//            if (count == 2) {
//                setVisible()
//            }
//            binding.btn9.animate().rotationY(90f).setDuration(800).start()
//
//            countDownTimer = object : CountDownTimer(800, 1000) {
//                override fun onTick(millisUntilFinished: Long) {
//                }
//
//                override fun onFinish() {
//                    binding.btn9.animate().rotationY(180f).setDuration(800).start()
//                    binding.btn9.background =
//                        ContextCompat.getDrawable(this@MainActivity, list3[9])
//                }
//            }.start()
//        }
//
//
//        binding.btn10.setOnClickListener {
//            count++
//            if (count == 2) {
//                setVisible()
//            }
//            binding.btn10.animate().rotationY(90f).setDuration(800).start()
//
//            countDownTimer = object : CountDownTimer(800, 1000) {
//                override fun onTick(millisUntilFinished: Long) {
//                }
//
//                override fun onFinish() {
//                    binding.btn10.animate().rotationY(180f).setDuration(800).start()
//                    binding.btn10.background =
//                        ContextCompat.getDrawable(this@MainActivity, list3[10])
//                }
//            }.start()
//        }
//
//
//        binding.btn11.setOnClickListener {
//            count++
//            if (count == 2) {
//                setVisible()
//            }
//            binding.btn11.animate().rotationY(90f).setDuration(800).start()
//
//            countDownTimer = object : CountDownTimer(800, 1000) {
//                override fun onTick(millisUntilFinished: Long) {
//                }
//
//                override fun onFinish() {
//                    binding.btn11.animate().rotationY(180f).setDuration(800).start()
//                    binding.btn11.background =
//                        ContextCompat.getDrawable(this@MainActivity, list3[11])
//                }
//            }.start()
//        }
//
//
//        binding.btn12.setOnClickListener {
//            count++
//            if (count == 2) {
//                setVisible()
//            }
//            binding.btn12.animate().rotationY(90f).setDuration(800).start()
//
//            countDownTimer = object : CountDownTimer(800, 1000) {
//                override fun onTick(millisUntilFinished: Long) {
//                }
//
//                override fun onFinish() {
//                    binding.btn12.animate().rotationY(180f).setDuration(800).start()
//                    binding.btn12.background =
//                        ContextCompat.getDrawable(this@MainActivity, list3[12])
//                }
//            }.start()
//        }
//
//
//    }
//
//    private fun addList() {
//        for (i in 0..29) {
//            list.add(R.drawable.photo_1 + i)
//        }
//
//        list.shuffle()
//
//        for (i in 1..7) {
//            list1.add(list[i])
//            list2.add(list[i])
//        }
//        for (i in 1..6) {
//            list3.add(list1[i])
//        }
//        for (i in 1..6) {
//            list3.add(list2[i])
//        }
//    }
//
//    private fun setVisible() {
//        binding.btn1.isEnabled = false
//        binding.btn2.isEnabled = false
//        binding.btn3.isEnabled = false
//        binding.btn4.isEnabled = false
//        binding.btn5.isEnabled = false
//        binding.btn6.isEnabled = false
//        binding.btn7.isEnabled = false
//        binding.btn8.isEnabled = false
//        binding.btn9.isEnabled = false
//        binding.btn10.isEnabled = false
//        binding.btn11.isEnabled = false
//        binding.btn12.isEnabled = false
//    }
//}
//
//
//}