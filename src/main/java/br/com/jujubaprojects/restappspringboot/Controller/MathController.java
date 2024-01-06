package br.com.jujubaprojects.restappspringboot.Controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.jujubaprojects.restappspringboot.Converter.NumberConverter;
import br.com.jujubaprojects.restappspringboot.exceptions.UnsupportedMathOperationExeption;
import br.com.jujubaprojects.restappspringboot.math.SimpleMath;


@RestController
public class MathController {
    
    private static  final AtomicLong counter = new AtomicLong();
    	private SimpleMath math = new SimpleMath();


    @GetMapping("/sum/{numberOne}/{numberTwo}")
    public double sum(@PathVariable(value = "numberOne")  String numberOne, @PathVariable(value ="nummberTwo") String numberTwo) throws Exception{

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationExeption("Please set a Numeric value");
        }
		return math.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));

    }

    @GetMapping("/sub/{numberOne}/{numberTwo}")
    public double subtration(@PathVariable(value = "numberOne")  String numberOne, @PathVariable(value ="numberTwo") String numberTwo)throws Exception{

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationExeption("Please set a Numeric value");
        }
      
		return math.subtraction(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

     @GetMapping("/multi/{numberOne}/{numberTwo}")
    public double multiplication(@PathVariable(value = "numberOne")  String numberOne, @PathVariable(value ="numberTwo") String numberTwo)throws Exception{

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationExeption("Please set a Numeric value");
        }
      
		return math.multiplication(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }


     @GetMapping("/division/{numberOne}/{numberTwo}")
    public double division(@PathVariable(value = "numberOne")  String numberOne, @PathVariable(value ="numberTwo") String numberTwo)throws Exception{

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationExeption("Please set a Numeric value");
        }
      
		return math.division(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

     @GetMapping("/mean/{numberOne}/{numberTwo}")
    public double mean(@PathVariable(value = "numberOne")  String numberOne, @PathVariable(value ="numberTwo") String numberTwo)throws Exception{

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationExeption("Please set a Numeric value");
        }
      
		return math.mean(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @GetMapping("/squareRoot/{number}")
	public Double squareRoot(@PathVariable(value = "number") String number) throws Exception{
		if(!NumberConverter.isNumeric(number)) {
			throw new UnsupportedOperationException("Please set a numeric value!");
		}
		return Math.sqrt(NumberConverter.convertToDouble(number));
	}
}
