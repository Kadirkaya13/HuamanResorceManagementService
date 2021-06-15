package com.example.hrms.core.helpers.imageHelper;

import org.springframework.web.multipart.MultipartFile;

import com.example.hrms.core.results.DataResult;

public interface ImageService {
	DataResult<?> save(MultipartFile file);
}
