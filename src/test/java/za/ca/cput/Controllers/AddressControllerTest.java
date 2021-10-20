package za.ca.cput.Controllers;
/* AddressEntity.java
   Author : Hlombekazi Mbelu (209024666)
   Date : 20 October 2021
 */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import za.ca.cput.Entity.StaffDetails.Address;
import za.ca.cput.Factory.AddressFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AddressControllerTest {

    private static Address address = AddressFactory.createAddress("Mkonto Crescent", "Khayelitsha"
                                        , "Cape town" , "South Africa" , 17 , 7784);
    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/address";

    @Test
    void a_create() {
        String url = baseURL + "/create";
        ResponseEntity<Address> postResponse = restTemplate.postForEntity(url , address , Address.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        address = postResponse.getBody();
        System.out.println("Saved addresses: " + address);
        assertEquals(address.getAddressId() , postResponse.getBody().getAddressId());
    }

    @Test
    void c_read() {
        String url = baseURL + "/read" + address.getAddressId() + address.getStreetName() + address.getStreetNumber()
                + address.getCity() + address.getCountry() + address.getPostalCode();
        System.out.println("URL: " + url);
        ResponseEntity<Address> responseEntity = restTemplate.getForEntity(url , Address.class);
        assertNotEquals(address.getAddressId() , responseEntity.getBody().getAddressId());
    }

    @Test
    void d_update() {
        Address update = new Address.Builder().copy(address).setAddressId("1").build();
        String url = baseURL + "/update";
        System.out.println("URL: " + url);
        System.out.println("Post date: " + update);
        ResponseEntity<Address> responseEntity = restTemplate.postForEntity(url , update , Address.class);
        assertNotNull(responseEntity.getBody());
    }


    @Test
    void d_getAll() {
        String url = baseURL + "/getall/";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<Address> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println("Display All: ");
        System.out.println(response);
        System.out.println(response.getBody());
    }

    @Test
    void e_delete() {
        String url = baseURL + "/delete" + address.getAddressId();
        System.out.println("URL " + url);
        restTemplate.delete(url);

    }

}