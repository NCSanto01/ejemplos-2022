package edu.icai.gittpat.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
	private Long id;
	private Long customerId;
	private LocalDate date;

	public OrderDTO(Long id, Long customerId, LocalDate date) {
		this.id = id;
		this.customerId = customerId;
		this.date = date;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public LocalDate getDate() {
		return this.date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
}
