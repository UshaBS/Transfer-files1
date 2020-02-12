package com.example.demo.entity;
import org.springframework.stereotype.Component;

@Component
public class Inputs {
	
	private String swagger;
    private String description;
	private String version;
	private String basePath;
	private String title;
	private String host;
	private String path;
	
	public String getVersion() {
		return version;
	}
	public String getSwagger() {
		return swagger;
	}
	public void setSwagger(String swagger) {
		this.swagger = swagger;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	public String getBasePath() {
		return basePath;
	}
	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	
	
	

}
