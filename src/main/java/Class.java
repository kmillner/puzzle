import org.sql2o.*;
import java.util.List;

public class Class {

   private int id;

  public Class () {
    // pass ^arguments as necessary.
    // instantiate - assign values to variables, etc.
  }

  public int getId() {
    return id;
  }

  public static List<Class> all() {
    String sql = "SELECT * FROM table_name";
    try(Connection con = DB.sql2o.open()) {
      return con.createQuery(sql).executeAndFetch(Class.class);
    }
  }

  @Override
  public boolean equals(Object otherClassInstance) {
    if (!(otherClassInstance instanceof Class)) {
      return false;
    } else {
      Class newClassInstance = (Class) otherClassInstance;
      return // this.anyOtherAttributes().equals(newClassInstance.anyOtherAttributes()) &&
                this.getId() == newClassInstance.getId();
    }
  }

}
