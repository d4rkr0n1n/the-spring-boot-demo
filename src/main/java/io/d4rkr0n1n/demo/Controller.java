package io.d4rkr0n1n.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Controller {
  
  @GetMapping("test")
  public String test(){
    return "test success";
  }
}
