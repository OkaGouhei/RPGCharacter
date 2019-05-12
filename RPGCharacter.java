
public class RPGCharacter{
  public static void main(String[] args){

    Movable TeamA[] = new Movable[4];

    TeamA[0] = new Knight("heroA",3000,300,300);
    TeamA[1] = new Magician("magicianA1",2000,300,300);
    TeamA[2] = new Magician("magicianA2",5000,200,200);
    TeamA[3] = new Monster("ET",5000,200,200);

    Character TeamB[] = new Character[3];
    TeamB[0] = new Knight("heroB",1000,300,300);
    TeamB[1] = new Magician("magicianB1",5000,300,300);
    TeamB[2] = new Magician("magicianB2",4000,200,200);

    boolean TeamA_LOSE ;
    boolean TeamB_LOSE ;

    do{
        for(int i = 0 ; i<TeamA.length ;i++){
            for(int j = 0 ; j<TeamB.length  ;j++){
                if(TeamA[i] instanceof Character){
                    if (((Character)TeamA[i]).getHp()>0){
                        ((Character)TeamA[i]).Attack(TeamB[j]);
                        TeamA[i].move(TeamB[j]);
                    }
                }else{
                    TeamA[i].move(TeamB[j]);
                }
                if (TeamB[j].getHp()>0){
                    if(TeamA[i] instanceof Character){
                        TeamB[j].Attack((Character)TeamA[i]);
                    }
                }
                if (TeamA[i] instanceof Character){
                    ((Character)TeamA[i]).introduce();
                }
                TeamB[j].introduce();
            }
        }
        TeamA_LOSE = (((Character)TeamA[0]).getHp() <= 0 &&((Character)TeamA[1]).getHp() <=0 && ((Character)TeamA[2]).getHp() <=0 && ((Monster)TeamA[3]).getHp()<=0);
        TeamB_LOSE = (TeamB[0].getHp() <= 0 &&TeamB[1].getHp() <=0 && TeamB[2].getHp()<=0 );
    }while(( !TeamA_LOSE ) && ( !TeamB_LOSE ));
    if(TeamA_LOSE){
        System.out.println("TeamAは全滅した");
    }
    if(TeamB_LOSE){
        System.out.println("TeamBは全滅した");
    }
  }
}

