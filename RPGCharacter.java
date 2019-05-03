
public class RPGCharacter{
  public static void main(String[] args){

    Character TeamA[] = new Character[3];

    TeamA[0] = new Knight("heroA",3000,300,300);
    TeamA[1] = new Magician("magicianA1",2000,300,300);
    TeamA[2] = new Magician("magicianA2",5000,200,200);
    Monster ET = new Monster("ET",5000,200,200);


    Character TeamB[] = new Character[3];
    TeamB[0] = new Knight("heroB",1000,300,300);
    TeamB[1] = new Magician("magicianB1",5000,300,300);
    TeamB[2] = new Magician("magicianB2",4000,200,200);
    do{
        for(int i = 0 ; i<3 ;i++){
            for(int j = 0 ; j<3 ;j++){
                if (TeamA[i].hp>0){
                    TeamA[i].Attack(TeamB[j]);
                    TeamA[i].move(TeamB[j]);
                    ET.move(TeamB[j]);
                }
                if (TeamB[i].hp>0){
                    TeamB[i].Attack(TeamA[j]);
                }
            }
            TeamA[i].introduce();
            TeamB[i].introduce();
        }
    }while((TeamA[0].hp > 0 || TeamA[1].hp >0 || TeamA[2].hp >0) && (TeamB[0].hp >0 || TeamB[1].hp >0 || TeamB[2].hp >0));

    if(TeamA[0].hp <= 0 &&TeamA[1].hp <=0 && TeamA[2].hp <=0){
        System.out.println("TeamAは全滅した");
    }
    if(TeamB[0].hp <= 0 &&TeamB[1].hp <=0 && TeamB[2].hp <=0){
        System.out.println("TeamBは全滅した");
    }
  }
}

