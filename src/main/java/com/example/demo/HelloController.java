/**    
* @Title: HelloController.java  
* @Package com.example.demo  
* @Description: TODO
* @author xiongJinGang 
* @date 2018年1月30日 下午4:56:47  
* @version V1.0    
*/
package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc 
 * @author xiongJinGang
 * @date 2018年1月30日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public Object hello() {
		return "你好啊，欢迎回来！";
	}
}
