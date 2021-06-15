package com.example.hrms.core.helpers.imageHelper.cloudinary.configuration;

import org.springframework.context.annotation.Bean;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.example.hrms.core.helpers.imageHelper.ImageService;
import com.example.hrms.core.helpers.imageHelper.cloudinary.CloudinaryManager;

public class CloudConfiguration {
	
	@Bean
	public Cloudinary cloudinaryService() {
		return new Cloudinary(ObjectUtils.asMap("cloud_name", "dsov3sz16", "api_key", "365734245757544",
				"api_secret", "8XCejewQBVejDub32jR12BL7tLM"));
	}

	@Bean
	public ImageService imageService() {
		return new CloudinaryManager(cloudinaryService());
	}
}
