package com.developer.springframework.msscbreweryclient.web.client;

import com.developer.springframework.msscbreweryclient.web.model.BeerDto;
import com.developer.springframework.msscbreweryclient.web.model.CustomerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient client;

    @Test
    void getBeerById() {
        BeerDto beerDto = client.getBeerById(UUID.randomUUID());
        assertNotNull(beerDto);
    }

    /*   @Test
       void saveNewBeer(){
        //TODO
           BeerDto beerDto=BeerDto.builder().beerName("New Beer").build();
           URI uri=client.saveNewBeer(beerDto);
           assertNotNull(uri);
           System.out.println(uri.toString());
       }
   */
    @Test
    void testUpdateBeer() {
        BeerDto beerDto = BeerDto.builder().beerName("New Beer").build();
        client.updateBeer(UUID.randomUUID(), beerDto);
    }

    @Test
    void testDeleteBeer() {
        client.deleteBeer(UUID.randomUUID());
    }

    @Test
    void getCustomerById() {
        CustomerDto customerDto = client.getCustomerById(UUID.randomUUID());
        assertNotNull(customerDto);
    }

    /*
        @Test
        void testSaveCustomer(){
            CustomerDto customerDto=CustomerDto.builder().name("Rohit").build();
            URI uri=client.addCustomer(customerDto);
            assertNotNull(uri);
        }
      */
    @Test
    void updateCustomer() {
        CustomerDto customerDto = CustomerDto.builder().name("rohit").build();
    }

    @Test
    void deleteCustomer() {
        client.deleteById(UUID.randomUUID());
    }
}