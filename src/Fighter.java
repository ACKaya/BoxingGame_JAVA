public class Fighter {
    String name;
    int damage,health,weight;
    double dodge;
    Fighter(String name,int damage,int health,int weight,double dodge){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        this.dodge=dodge;
    }
    int  hit(Fighter foe){
        System.out.println(foe.name+"=>"+this.name+"'a "+foe.damage+" Hasar Vurdu");
        if(this.health-foe.damage<0){
            return 0;
        }
        if(isDoge()){
            System.out.println(this.name+" Gelen Hasari Dodgeledi");
            return this.health;
        }



        return this.health-foe.damage;
    }
    boolean isDoge(){
        double randomNumber=Math.random()*100;
        return randomNumber<this.dodge;


    }
}
