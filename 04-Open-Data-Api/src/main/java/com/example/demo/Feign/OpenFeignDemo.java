package com.example.demo.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="Welcome-Api")
public interface OpenFeignDemo {
	@GetMapping("/welcome")
	public String invokeWelcom();

}
