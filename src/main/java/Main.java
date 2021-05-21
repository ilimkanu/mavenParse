import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{ \"product\" : \"astro\" , \"init\" : \"2021051406\"}";
        ObjectMapper objectMapper = new ObjectMapper();
        Product product = objectMapper.readValue(json, Product.class);
        System.out.println(product);
    }
}
