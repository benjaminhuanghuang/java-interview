package common;
import com.google.gson.Gson;


public class JsonDemo {
    public static Person deserialize(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Person.class);
    }
}
