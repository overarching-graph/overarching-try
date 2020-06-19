package com.hp.file_upload;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


import controller.FileUploadController;


@Configuration
@EnableAutoConfiguration
@ComponentScan({"file_upload","controller"})

public class GraphFileUploadApplication {

	public static void main(String[] args) {
		
		
		new File(FileUploadController.uploadDirectory).mkdir();
		
		SpringApplication.run(GraphFileUploadApplication.class, args);
	}

	

}


