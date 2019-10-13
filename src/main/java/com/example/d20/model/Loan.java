package com.example.d20.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
 
@Entity
@Table(name = "tb_loan")
public class Loan {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	
	@ManyToOne
	private Ownership item;
	
	@ManyToOne
	private User loanee;
	
	@Column(name = "price")
	private double price;
	
	public Loan() {}
	public Loan(Ownership item, User loanee, double price) {
		this.item = item;
		this.price = price;
		this.loanee = loanee;
	}
	
	public Loan(Ownership item, User loanee) {
		this.item = item;
		this.loanee = loanee;
		this.price = item.getPrice();
	}
	
	public Ownership getItem() {
		return this.item;
	}
	
	public User getLoanee() {
		return this.loanee;
	}

	public void setItem(Ownership item) {
		this.item = item;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loan other = (Loan) obj;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
}
