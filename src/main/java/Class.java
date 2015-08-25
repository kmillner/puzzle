import org.sql2o.*;
// import stuff

public class Class {

  private <Class> mMemberVariable();

  public Class (<Class> argument) {
    // instantiate - assign values to variables, etc.
  }

  @Override
  public boolean equals(Object otherClassInstance){
    if (!(otherClassInstance instanceof Class)) {
      return false;
    } else {
      Class newClassInstance = (Class) otherClassInstance;
      return this.getId() == newClassInstance.getId(); // &&
          // this.anyOtherAttributes().equals(newClassInstance.anyOtherAttributes());      
    }
  }

  // Class methods

}
