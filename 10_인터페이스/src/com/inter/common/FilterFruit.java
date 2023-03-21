package com.inter.common;

import com.inter.modle.vo.Fruit;

@FunctionalInterface
public interface FilterFruit {
	boolean check(Fruit f, Object data);
	
	
	
	
	
	
}
