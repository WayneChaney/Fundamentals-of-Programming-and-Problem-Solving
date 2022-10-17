  import java.util.ArrayList;
public class ContactInfo{
  
  private String name;
  private ArrayList<Phone> phoneNums;
  
  public ContactInfo(){
    name = "unknown";
    phoneNums= new ArrayList<Phone>();
  }
  public ContactInfo(String name,ArrayList<Phone> phoneNums){
    this.name = name;
    this.phoneNums = phoneNums;
  }
  public String getName(){
    return this.name;
  }
  public ArrayList<Phone> getPhones(){
    return phoneNums;
  }
  public boolean addPhone(Phone p){
    
    for( int i = 0; i < getPhones().size();i++){
      if(getPhones().get(i).getLabel().equals(p.getLabel()) ||
         getPhones().get(i).getPhonNum().equals(p.getPhonNum()))
        return false;
    }
    
    getPhones().add(p);
    return true;
  }
   public boolean removePhones(Phone p){
     for( int i = 0; i < getPhones().size();i++){
     if(getPhones().get(i).getLabel().equals(p.getLabel())){
            getPhones().remove(p);
    return true;
     }}
     for( int j = 0; j < getPhones().size();j++){
        if(getPhones().get(j).getPhonNum().equals(p.getPhonNum())){
             getPhones().remove(p);
             return true;
        }
     } return false; }}
     

