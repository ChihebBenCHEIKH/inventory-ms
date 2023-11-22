package enit.soa.product.dto;

import com.fasterxml.jackson.annotation.JsonCreator;

import enit.soa.product.enums.ActionStatus;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProductEventDTO {
    private String idProduct;
    private Long quantity;
    private String idOrder;
    private ActionStatus actionStatus;

    public ActionStatus getActionStatu() {
        return actionStatus;
    }

    // Setter
    public void setActionStatu(ActionStatus actionStatus) {
        this.actionStatus = actionStatus;
    }

    // Default constructor
    public ProductEventDTO() {
    }

    // Constructor with all fields
    public ProductEventDTO(String idProduct, Long quantity, String idOrder) {
        this.idProduct = idProduct;
        this.quantity = quantity;
        this.idOrder = "";
    }

    // Additional constructor without idOrder
    public ProductEventDTO(String idProduct, Long quantity) {
        this.idProduct = idProduct;
        this.quantity = quantity;
        this.idOrder = "";
    }

    // Getter and Setter methods for 'idProduct'
    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    // Getter and Setter methods for 'quantity'
    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    // Getter and Setter methods for 'idOrder'
    public String getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(String idOrder) {
        this.idOrder = idOrder;
    }
}
