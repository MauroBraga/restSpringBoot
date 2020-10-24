package br.com.mrb.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.mrb.exception.UnsuportedMathOperationExcpetion;
import br.com.mrb.math.SimpleMath;
import br.com.mrb.request.converters.NumberConverter;

@RestController
public class MathController {
	
	private SimpleMath math = new SimpleMath();
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	private Double sum(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable (value = "numberTwo") String numberTwo) throws UnsuportedMathOperationExcpetion {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))
			throw new UnsuportedMathOperationExcpetion("Please set a numeric value");
		
		
		return math.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
		
	}
	
	
	@RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	private Double subtraction(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable (value = "numberTwo") String numberTwo) throws UnsuportedMathOperationExcpetion {
		
		if(! NumberConverter.isNumeric(numberOne) || ! NumberConverter.isNumeric(numberTwo))
			throw new UnsuportedMathOperationExcpetion("Please set a numeric value");
		
		return math.subtraction(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
		
	}

	@RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	private Double multiplication(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable (value = "numberTwo") String numberTwo) throws UnsuportedMathOperationExcpetion {
		
		if(! NumberConverter.isNumeric(numberOne) || ! NumberConverter.isNumeric(numberTwo))
			throw new UnsuportedMathOperationExcpetion("Please set a numeric value");
		
		return math.multiplication(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
		
	}
	
	@RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	private Double division(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable (value = "numberTwo") String numberTwo) throws UnsuportedMathOperationExcpetion {
		
		if(! NumberConverter.isNumeric(numberOne) || ! NumberConverter.isNumeric(numberTwo))
			throw new UnsuportedMathOperationExcpetion("Please set a numeric value");
		
		return math.division(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
		
	}
	
	//   squareRoot
	@RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	private Double mean(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable (value = "numberTwo") String numberTwo) throws UnsuportedMathOperationExcpetion {
		
		if(! NumberConverter.isNumeric(numberOne) || ! NumberConverter.isNumeric(numberTwo))
			throw new UnsuportedMathOperationExcpetion("Please set a numeric value");
		
		return math.mean(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
		
	}
	
	@RequestMapping(value = "/squareRoot/{number}", method = RequestMethod.GET)
	private Double squareRoot(@PathVariable(value = "number") String number) throws UnsuportedMathOperationExcpetion {
		
		if(! NumberConverter.isNumeric(number))
			throw new UnsuportedMathOperationExcpetion("Please set a numeric value");
		
		return math.squareRoot(NumberConverter.convertToDouble(number));		
		
	}

}
