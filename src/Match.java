public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    Match(int minWeight,int maxWeight,Fighter f1,Fighter f2){
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
        this.f1=f1;
        this.f2=f2;
    }
    void run(){
        if(isCheck()){
            while(this.f1.health>0&&this.f2.health>0){
            f1.health= f1.hit(f2);
            if(isWin()){
                break;
            }
            System.out.println(this.f1.name+"'nin kalan cani:"+this.f1.health);
            f2.health= f2.hit(f1);
            if(isWin()){
                break;

                }
            System.out.println(this.f2.name+"'nin kalan cani:"+this.f2.health);


            }
        }
        else{
            System.out.println("Sporcularin sikletleri uyusmuyor");
        }

    }
    boolean isCheck(){
        return((f1.weight>minWeight&&f1.weight<maxWeight)&&(f2.weight>minWeight&&f2.weight<maxWeight));

    }
    boolean isWin(){
        if(f1.health<=0){
            System.out.println(this.f2.name+" Kazandi!!");
            return true;
        }
        if(this.f2.health<=0){
            System.out.println(this.f1.name+" Kazandi!!");
            return true;
        }
        return false;

    }
}
