package com.startupweb.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MENSAJE")
public class Mensaje {

	private long id;
	private Conversacion conversacion;
	private User userTo;
	private User userFrom;

	public Mensaje() {
	}

	
	
    @Id
    @GeneratedValue
	@Column(name = "MENSAJE_ID")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne
    @JoinColumn(name = "CONVERSACION_ID")
	public Conversacion getConversacion() {
		return conversacion;
	}


	public void setConversacion(Conversacion conversacion) {
		this.conversacion = conversacion;
	}

	@ManyToOne
    @JoinColumn(name = "USER_FROM_ID")
	public User getUserFrom() {
		return userFrom;
	}


	public void setUserFrom(User userFrom) {
		this.userFrom = userFrom;
	}


	@ManyToOne
    @JoinColumn(name = "USER_TO_ID")
	public User getUserTo() {
		return userTo;
	}



	public void setUserTo(User userTo) {
		this.userTo = userTo;
	}

}