package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
public class InvoiceDaoTestSuite {
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Milk");
        Product product2 = new Product("Bread");
        Product product3 = new Product("Ham");
        productDao.save(product);
        productDao.save(product2);
        productDao.save(product3);

        Invoice invoice = new Invoice("One");
        Invoice invoice2 = new Invoice("Two");
        invoiceDao.save(invoice);
        invoiceDao.save(invoice2);

        Item item = new Item(product, new BigDecimal(100), 2, new BigDecimal(50), invoice);
        Item item2 = new Item(product2, new BigDecimal(150), 2, new BigDecimal(100), invoice2);
        Item item3 = new Item(product3, new BigDecimal(200), 2, new BigDecimal(150), invoice);
        itemDao.save(item);
        itemDao.save(item2);
        itemDao.save(item3);
        //When
        int invoiceId = invoice.getId();
        int invoice2Id = invoice.getId();
        int invoiceItems = itemDao.countByInvoiceId(invoice.getId());
        int invoice2Items = itemDao.countByInvoiceId(invoice2.getId());
        //Then
        assertNotEquals(0, invoiceId);
        assertNotEquals(0, invoice2Id);
        assertEquals(2, invoiceItems);
        assertEquals(1, invoice2Items);
    }
}
