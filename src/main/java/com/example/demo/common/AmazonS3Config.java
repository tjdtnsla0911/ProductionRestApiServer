package com.example.demo.common;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
//AWS S3関連の@Configuration 2022.04.21
@Configuration
public class AmazonS3Config {
	
	final static String TAG = "@@@@@@@ ";
	public final Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	
	@Value("${cloud.aws.credentials.access-key}")
	private String accessKey;
	
	@Value("${cloud.aws.credentials.secret-key}")
	private String secretKey;
	
	@Value("${cloud.aws.region.static}")
	private String region;
	
	@Bean
	public AmazonS3Client amazonS3Client() {
		logger.debug(TAG + "AmazonS3Client Start!!");
		System.err.println("### accessKey : "+accessKey);
		BasicAWSCredentials awsCreds = new BasicAWSCredentials(accessKey, secretKey);
		return (AmazonS3Client)AmazonS3ClientBuilder.standard()
				.withRegion(region)
				.withCredentials(new AWSStaticCredentialsProvider(awsCreds))
				.build();
		
	}
	
}
