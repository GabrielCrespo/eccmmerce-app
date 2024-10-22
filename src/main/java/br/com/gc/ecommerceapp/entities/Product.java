package br.com.gc.ecommerceapp.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_products")
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String description;

    private BigDecimal price;

    private Integer quantity;

    private String image;

    private Set<Category> categories = new HashSet<>();

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
