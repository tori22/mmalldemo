package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by DWT on 2018/3/26.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
