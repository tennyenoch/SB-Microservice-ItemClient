/**
 * 
 */
package com.example.demo;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tenny
 *
 */
@FeignClient(name="Item-catalog-service")
@RestController("/top-brands")
public interface ItemClient {

}
