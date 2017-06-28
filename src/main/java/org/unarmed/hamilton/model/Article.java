package org.unarmed.hamilton.model;



public class Article {
	public Article(long id, String content) {
		this.id = id;
		this.content = content;
		}
	public Long getId(){
		return id;
	}
	public String getContent(){
		return content;
	}
	Long id;
	String content;
}
