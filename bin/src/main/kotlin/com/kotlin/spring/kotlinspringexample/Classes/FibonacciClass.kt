package com.kotlin.spring.kotlinspringexample.Classes

class FibonacciClass {
	companion object {
		fun fib(index: Int): Int {
			if (index == 0 || index == 1)
				return 1;

			val array = IntArray(index + 1)
			array[0] = 1
			array[1] = 1

			for (i in 2..array.size - 1) {
				array[i] = array[i - 1] + array[i - 2]
			}

			return array[index]

		}
	}
}