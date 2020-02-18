package com.kotlin.spring.kotlinspringexample

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import com.kotlin.spring.kotlinspringexample.Classes.FibonacciClass



@Controller
class RestController {

	
	@ResponseBody
    @GetMapping("/isAnnogram")
    fun Annogram(@RequestParam(value = "string1", defaultValue = "0") string1: String,@RequestParam(value = "string2", defaultValue = "1") string2: String) :AnnogramModel
	{
		
    	if (FunctionsClass.isAnnogram(string1.toString(),string2.toString()))
		{
			return  AnnogramModel(string1.toString(),string2.toString(),"The two strings are annograms")
		}
		else
		{
			return  AnnogramModel(string1.toString(),string2.toString(),"The two string are NOT annograms")
		}
		
	}
	
	@ResponseBody
    @GetMapping("/fibonacci")
    fun Fibonacci(@RequestParam(value = "index", defaultValue = "0") index: Int) :FibonacciModel
	{
		
    	if (index >= 0)
		{
			return  FibonacciModel(index.toString(),"The Fibonacci number at index provided is " + FibonacciClass.fib(index) )
		}
		else
		{
			return  FibonacciModel(index.toString(),"The Fibonacci number at index provided is invalid. Index must be a positive number")
		}
		
	}
	
	
}