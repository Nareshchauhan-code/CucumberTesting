package stepdefenations;

import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;


public class UserNamePassword {

    @Given("MyCredential")
    public void my_credential(io.cucumber.datatable.DataTable dataTable) {

        Map<String, String> map = dataTable.asMap();
        System.out.println(map.values());
        System.out.println(map.keySet());


    }


}
