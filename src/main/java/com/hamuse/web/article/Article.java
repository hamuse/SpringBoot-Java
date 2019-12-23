package com.hamuse.web.article;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="ARTICLE")
public class Article {
	@Id
	@GeneratedValue
	@Column(name="IMAGE",length=30, nullable=false) 
	private Long image;
	@Column(name="UID",length=30, nullable=false) 
	private String uid;
	@Column(name="COMMENTS",length=30, nullable=false) 
	private String comments;
	@Column(name="DM",length=30, nullable=false) 
	private String dm;
	@Column(name="RATING",length=30, nullable=false) 
	private String rating;
	@Column(name="BOARDTYPE",length=30, nullable=false) 
	private String boardtype;
	@Column(name="TITLE",length=30, nullable=false) 
	private String title;
	@Column(name="CONTENT",length = 30, nullable=false) 
	private String content;
		
}
