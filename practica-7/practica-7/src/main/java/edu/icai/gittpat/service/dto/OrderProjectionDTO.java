package edu.icai.gittpat.service.dto;


import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderProjectionDTO {

	private Long id;
	private String contactName;
	private String customerName;
	private String country;
	private LocalDateTime date;

	public OrderProjectionDTO(Long id, String contactName, String customerName, String country, LocalDateTime date) {
		this.id = id;
		this.contactName = contactName;
		this.customerName = customerName;
		this.country = country;
		this.date = date;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LocalDateTime getDate() {
		return this.date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

}
