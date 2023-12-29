package com.makaylass.bookclub.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="books")
public class Book {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank
		private String title;
		
		@NotBlank
		private String author;
		
		
		//////////////////// Created/Updated at
		@Column(updatable = false)
		private Date createdAt;
		
		private Date updatedAt;
		
		
		//////////////////// Relationships
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name="user_id")
		@NotNull
		private User user;
		
		//////////////////// Constructor
		
		public Book() {}
		
		
		//////////////////// Getters & Setters
		@PrePersist
		protected void onCreate() {
			this.createdAt = new Date();
		}
		
		@PreUpdate
		protected void onUpdate() {
			this.updatedAt = new Date();
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public String getAuthor() {
			return author;
		}


		public void setAuthor(String author) {
			this.author = author;
		}


		public User getUser() {
			return user;
		}


		public void setUser(User user) {
			this.user = user;
		}

		


		
}