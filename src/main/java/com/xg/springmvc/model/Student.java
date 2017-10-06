package com.xg.springmvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by Intellij IDEA
 * Author: xionggao
 * Desc:
 * Date: 2017/10/6
 * Email: xionggao@terminus.io
 */
@Data
@AllArgsConstructor
public class Student implements Serializable{
	
	private static final long serialVersionUID = 8943404450082822449L;
	
	private Long id;
	
	private String name;
	
	private Integer age;
	
}
