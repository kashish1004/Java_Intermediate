package com.phoenix.annotations;
/*
 * @author kashish.jain@stltech.in
 * @creation date 13-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.FIELD})
public @interface CopyrightInfo {
	String author();
	double version() default 1.0;
	String copyright() default "Sterlite Technologies Ltd";
}
