import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.out;
import java.lang.*;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

  public class App {

      public static void main(String[] args) {
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";

        get("/", (request, response) -> {
          HashMap<String, Object> model = new HashMap<String, Object>();
          model.put("template", "templates/home.vtl");

          return new ModelAndView(model, layout);
        },new VelocityTemplateEngine());

        get("/puzzle", (request, response) -> {
          HashMap<String, Object> model = new HashMap<String, Object>();
          model.put("template", "templates/puzzle.vtl");


          String word = request.queryParams("word");
          String puzzled = replaceVowels(word);
          Boolean isBlank = false;

          if (word.length() == 0) {
            isBlank = true;
          }

          model.put("word", word);
          model.put("puzzledWord", puzzledWord);
          model.put("isBlank", isBlank);
          return new ModelAndView(model, layout);
        },new VelocityTemplateEngine());

      public static String replaceVowels(String word) {
        String[] vals = {"a", "u", "o", "e", "i"};
        for(String val : vals)
            s = s.replaceAll(val, "_");
        return word;
      }

 }
