package enit.soa.product.dto;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProductEventResponseDTO {
    private String message;

    // Default constructor
    public ProductEventResponseDTO() {
    }

    // Constructor with all fields
    public ProductEventResponseDTO(String message) {
        this.message = message;
    }

    // Getter and Setter methods for 'message'
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
