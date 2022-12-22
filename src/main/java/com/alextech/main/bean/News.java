package com.alextech.main.bean;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "news")
public class News implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idnews")
	private int idnews;

	@Column(name = "title")
	private String title;

	@Column(name = "brief")
	private String brief;

	@Column(name = "content")
	private String content;

	@Column(name = "date")
	private String date;

	public int getIdnews() {
		return idnews;
	}

	public News() {

	}

	public void setIdnews(int idnews) {
		this.idnews = idnews;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brief, content, date, idnews, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		News other = (News) obj;
		return Objects.equals(brief, other.brief) && Objects.equals(content, other.content)
				&& Objects.equals(date, other.date) && idnews == other.idnews && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "News [idnews=" + idnews + ", title=" + title + ", brief=" + brief + ", content=" + content + ", date="
				+ date + "]";
	}

}
