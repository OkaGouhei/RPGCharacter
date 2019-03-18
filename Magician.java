class Magician extends Character{
  public Magician(String name,int hp ,int mp){
    this.name = name; //インスタンス変数のnameに引数で受け取ったnameを代入
    this.hp = hp;
    this.mp = mp;
  }
  public void introduce(){
    System.out.println("私は魔法が使える"+name+"だ。私の体力は"+hp+"だ。私のマジックポイントは"+mp+"だ");
  }

  public void Magic(Character c){
    System.out.println(name +"の魔法攻撃!!");
    c.damage(mp*2,name);
  }
  public void Attack(Character c){
    Magic(c);
  }


}
