package cn.edu.nwafu.hjpg;


public class User {

  private String id;
  private String password;
  private long type;
  private String username;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

}
