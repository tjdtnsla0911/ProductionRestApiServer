package com.example.demo.common;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.PutObjectRequest;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Component
public class AmazonS3Uploader {

	private final AmazonS3Client amazonS3Client;

	@Value("${cloud.aws.s3.bucket}")
	private String bucket; // Bucket Name...

	public String upload(MultipartFile multipartFile, String dirName) throws IOException {
		System.err.println("### multipartFile : " + multipartFile);
		System.err.println("### dirName : " + dirName);
		File uploadFile = convert(multipartFile) //File変換に失敗したらError
				.orElseThrow(() -> new IllegalArgumentException("error: MultipartFile -> File convert fail"));
		System.err.println("### 끝 uploadFile : " + uploadFile.toString());
		return upload(uploadFile, dirName);
	}

	// S3로 파일 업로드하기
	private String upload(File uploadFile, String dirName) {
		String fileName = dirName + "/" + UUID.randomUUID() + uploadFile.getName(); // S3에 저장된 파일 이름
		String uploadImageUrl = putS3(uploadFile, fileName); // s3로 업로드
		System.err.println("uploadImageUrl = " + uploadImageUrl);
		removeNewFile(uploadFile);
		return uploadImageUrl;
	}
 
	// S3へのUpload
	private String putS3(File uploadFile, String fileName) {
		amazonS3Client.putObject(
				new PutObjectRequest(bucket, fileName, uploadFile).withCannedAcl(CannedAccessControlList.PublicRead));
		return amazonS3Client.getUrl(bucket, fileName).toString();
	}

	//Lokerのイメージ削除
	private void removeNewFile(File targetFile) {
		if (targetFile.delete()) {
			log.info("@@@@ Data delete Ok!");
			return;
		}

		log.info("@@@@ Data delete fail...");
	}

	// LocelにデータUpload
	private Optional<File> convert(MultipartFile file) throws IOException {

		File convertFile = new File(System.getProperty("user.dir") + "/" + file.getOriginalFilename());
		if (!convertFile.createNewFile()) {
			try (FileOutputStream fos = new FileOutputStream(convertFile)) { 
																				
				fos.write(file.getBytes());
			}
			return Optional.of(convertFile);
		}

		return Optional.empty();
	}

}
