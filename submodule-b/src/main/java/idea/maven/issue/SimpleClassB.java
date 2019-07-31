package idea.maven.issue;

public class SimpleClassB {

  private CoreClass coreClass;

  public SimpleClassB(){
    coreClass = new CoreClass();
  }

  public String getName(){
    return coreClass.getName();
  }

}
