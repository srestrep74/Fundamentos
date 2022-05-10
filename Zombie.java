import java.util.ArrayList;

/**
 *
 * @author rpose
 */
public class Zombie {
      //Array (database)
    static ArrayList<Zombie> arrayZombiesDataBase = new ArrayList<Zombie>();

    //Atributes
    private String name;
    private int health;
    private int birth;
    private String rh;
    static int i = 0;

    public Zombie(String n, int h, int b, String r){
        this.name = n;
        this.health = h;
        this.birth = b;
        this.rh = r;
        i++;
    }

    //Getters from Zombie
    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.health;
    }

    public int getBirth(){
        return this.birth;
    }

    public String getRh(){
        return this.rh;
    }

    //Setters from Zombie
    public void setName(String n){
        this.name = n;
    }

    public void setHealth(int n){
        this.health = n;
    }

    public void setBirth(int n){
        this.birth = n;
    }

    public void setRh(String n){
        this.rh = n;
    }

    //Methods from Zombie
    public static void numberOne(String n, int h, int b, String r){
        Zombie z = new Zombie(n,h,b,r);
        Zombie.arrayZombiesDataBase.add(z);
    }   

    public static String numberTwo(ArrayList<Zombie> array){
        String info="";
        for(int i=0; i<array.size(); i++){
            info = info + "\n" + array.get(i).getName()+" - "+array.get(i).getHealth()+" - "+array.get(i).getBirth()+
            " - "+array.get(i).getRh();
        }
        return info; 
    }

    public static int numberThree(){
        return Zombie.i;
    }

    public static String numberFour(ArrayList<Zombie> array){
        String info="";
        for(int i=0; i<array.size(); i++){ 
            if(array.get(i).getRh().equals("AB+")||array.get(i).getRh().equals("O+")){
                info = info + "\n" + array.get(i).getName()+" - "+array.get(i).getHealth()+" - "+array.get(i).getBirth()+
                " - "+array.get(i).getRh();
            }
        }
        return info;  
    }

    public static String numberFive(ArrayList<Zombie> array){
        String info="";
        for(int i=0; i<array.size(); i++){ 
            if(array.get(i).getBirth()>2000){
                info = info + "\n" + array.get(i).getName()+" - "+array.get(i).getHealth()+" - "+array.get(i).getBirth()+
                " - "+array.get(i).getRh();
            }
        }
        return info;  
    }

    public static void numberSix(ArrayList<Zombie> array){
        for(int i=0; i<array.size(); i++){ 
            int ibomb= array.get(i).getHealth()/2;
            array.get(i).setHealth(ibomb);
        } 
    }
}
