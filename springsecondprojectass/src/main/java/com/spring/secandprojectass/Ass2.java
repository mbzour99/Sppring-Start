package com.spring.secandprojectass;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class Ass2 {
	@RequestMapping("/")
    public String hello() {
        return "Hello Human!!!";
        
}
@RequestMapping("/hi")
public String name(@RequestParam(value="name" ,required=false) String myname,@RequestParam(value="lastname" ,required=false) String lastname,@RequestParam(value="times" ,required=false) int times) {
     String names="";
	for(int i=0; i<times;i++) {
    	  names+="Hello"+myname+lastname+" ";
      }
	return "You searched for: " + myname+"  "+lastname+ names;
}

}



