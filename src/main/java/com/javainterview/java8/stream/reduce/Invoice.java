package com.javainterview.java8.stream.reduce;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {

    String invoiceNo;
    BigDecimal price;
    BigDecimal qty;
}
