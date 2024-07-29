package me.dio.entities;

public class Products {

    private Long id;
    private String description;
    private Double price;
    private Department department;

    public Products(){

    }
    public Products(Long id, String description, Double price, Department department) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
