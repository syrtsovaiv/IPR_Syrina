import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PetStoreApiTests { //УБРАТЬ ПРОБЕЛЫ

    @BeforeEach
    public void setup() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
    }

    @Test
    public void GetPetById() {
        given().
                pathParam("petId", 3004).
                when().
                get("/pet/{petId}").
                then().
                statusCode(200).
                body("id", equalTo(3004)).
                body("name", notNullValue());

    }

    @Test

    public void CreatePet() {

        String newPet = "{ \"id\": 1001, \"name\": \"Doggie\", \"status\": \"available\" }";
        given().
                contentType(ContentType.JSON).
                body(newPet).
                when().
                post("/pet").
                then().
                statusCode(200).
                body("id", equalTo(1001)).
                body("name", equalTo("Doggie")).
                body("status", equalTo("available"));

    }

    @Test

    public void testUpdatePet() {

        String updatedPet = "{ \"id\": 1001, \"name\": \"UpdatedDoggie\", \"status\": \"sold\" }";

        given().
                contentType(ContentType.JSON).
                body(updatedPet).
                when().
                put("/pet").
                then().
                statusCode(200).
                body("name", equalTo("UpdatedDoggie")).
                body("status", equalTo("sold"));

    }

    @Test

    public void testDeletePet() {

        given().
                pathParam("petId", 1001).
                when().
                delete("/pet/{petId}").
                then().
                statusCode(200).
                body("message", equalTo("1001"));

    }

}