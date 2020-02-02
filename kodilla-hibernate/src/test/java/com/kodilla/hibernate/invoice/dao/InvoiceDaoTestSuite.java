package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;


@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;
    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product( "printer" );
        Product product2 = new Product( "tv" );
        Product product3 = new Product( "laptop" );
        Item item1 = new Item( new BigDecimal( 100 ) , 2 );
        Item item2 = new Item( new BigDecimal( 500 ) , 3 );
        Item item3 = new Item( new BigDecimal( 150 ) , 1 );
        Invoice invoice = new Invoice( "FV/1/2020" );
        item1.setProduct( product );
        item2.setProduct( product2 );
        item3.setProduct( product3 );
        invoice.getItems().add( item1 );
        invoice.getItems().add( item2 );
        invoice.getItems().add( item3 );
        product.getItems().add(item1);
        product2.getItems().add(item2);
        product3.getItems().add(item3);
        item1.setInvoice( invoice );
        item2.setInvoice( invoice );
        item3.setInvoice( invoice );

        //When
        invoiceDao.save( invoice );
        productDao.save( product );
        productDao.save( product2 );
        productDao.save( product3);
        itemDao.save( item1 );
        itemDao.save( item2 );
        itemDao.save( item3 );

        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        //invoiceDao.deleteById(id);

    }
}
