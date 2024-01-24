package com.example.counter


    class Presenter(var counterView: CounterView) {
        private var model = CounterModel()

        fun increment() {
            model.increment()
            checkConditions()
            counterView.showNewCount(model.number)
        }

        fun decrement() {
            model.decrement()
            checkConditions()
            counterView.showNewCount(model.number)
        }

        private fun checkConditions() {
            if (model.number == 10) {
                counterView.showToast()
            } else if (model.number == 15) {
                counterView.changeTextGreen()
            }
        }
    }
